package typings.webpack.anon

import typings.node.bufferMod.global.Buffer
import typings.webpack.mod.FileSystemCallback
import typings.webpack.mod.FileSystemStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends StObject {
  
  def apply(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def apply(arg0: String, arg1: FileSystemCallback[FileSystemStats]): Unit = js.native
}
