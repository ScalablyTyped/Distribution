package typings.wordpressMediaUtils

import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@wordpress/media-utils/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MediaUpload[T /* <: Boolean */](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MediaUpload")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
