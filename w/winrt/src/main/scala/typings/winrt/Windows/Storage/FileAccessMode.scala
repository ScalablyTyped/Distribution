package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileAccessMode extends StObject
@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends StObject {
  
  @js.native
  sealed trait read extends FileAccessMode
  
  @js.native
  sealed trait readWrite extends FileAccessMode
}
