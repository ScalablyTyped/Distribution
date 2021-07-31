package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Host to create watch with config file
  */
@js.native
trait WatchCompilerHostOfConfigFile[T /* <: BuilderProgram */]
  extends StObject
     with WatchCompilerHost[T]
     with ConfigFileDiagnosticsReporter {
  
  /** Name of the config file to compile */
  var configFileName: java.lang.String = js.native
  
  var extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]] = js.native
  
  /** Options to extend */
  var optionsToExtend: js.UndefOr[CompilerOptions] = js.native
  
  /**
    * Used to generate source file names from the config file and its include, exclude, files rules
    * and also to cache the directory stucture
    */
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: java.lang.String): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: java.lang.String, extensions: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String],
    include: Unit,
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: Unit,
    include: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: Unit,
    include: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: Unit,
    include: Unit,
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: java.lang.String, extensions: Unit, exclude: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: Unit,
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: Unit,
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: Unit,
    exclude: js.Array[java.lang.String],
    include: Unit,
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: java.lang.String, extensions: Unit, exclude: Unit, include: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: java.lang.String,
    extensions: Unit,
    exclude: Unit,
    include: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: java.lang.String, extensions: Unit, exclude: Unit, include: Unit, depth: Double): js.Array[java.lang.String] = js.native
  
  var watchOptionsToExtend: js.UndefOr[WatchOptions] = js.native
}
