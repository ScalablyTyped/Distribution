package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsTyping {
  
  @js.native
  trait TypingResolutionHost extends StObject {
    
    def directoryExists(path: java.lang.String): Boolean = js.native
    
    def fileExists(fileName: java.lang.String): Boolean = js.native
    
    def readDirectory(rootDir: java.lang.String, extensions: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    def readDirectory(
      rootDir: java.lang.String,
      extensions: js.Array[java.lang.String],
      excludes: js.Array[java.lang.String]
    ): js.Array[java.lang.String] = js.native
    def readDirectory(
      rootDir: java.lang.String,
      extensions: js.Array[java.lang.String],
      excludes: js.Array[java.lang.String],
      includes: js.Array[java.lang.String]
    ): js.Array[java.lang.String] = js.native
    def readDirectory(
      rootDir: java.lang.String,
      extensions: js.Array[java.lang.String],
      excludes: js.Array[java.lang.String],
      includes: js.Array[java.lang.String],
      depth: Double
    ): js.Array[java.lang.String] = js.native
    def readDirectory(
      rootDir: java.lang.String,
      extensions: js.Array[java.lang.String],
      excludes: js.Array[java.lang.String],
      includes: Unit,
      depth: Double
    ): js.Array[java.lang.String] = js.native
    def readDirectory(
      rootDir: java.lang.String,
      extensions: js.Array[java.lang.String],
      excludes: Unit,
      includes: js.Array[java.lang.String]
    ): js.Array[java.lang.String] = js.native
    def readDirectory(
      rootDir: java.lang.String,
      extensions: js.Array[java.lang.String],
      excludes: Unit,
      includes: js.Array[java.lang.String],
      depth: Double
    ): js.Array[java.lang.String] = js.native
    def readDirectory(
      rootDir: java.lang.String,
      extensions: js.Array[java.lang.String],
      excludes: Unit,
      includes: Unit,
      depth: Double
    ): js.Array[java.lang.String] = js.native
    
    def readFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
    def readFile(path: java.lang.String, encoding: java.lang.String): js.UndefOr[java.lang.String] = js.native
  }
}
