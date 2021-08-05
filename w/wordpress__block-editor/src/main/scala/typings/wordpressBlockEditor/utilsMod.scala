package typings.wordpressBlockEditor

import typings.wordpressBlockEditor.mod.EditorStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@wordpress/block-editor/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformStyles(styles: js.Array[EditorStyle]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformStyles(styles: js.Array[EditorStyle], wrapperClassName: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformStyles")(styles.asInstanceOf[js.Any], wrapperClassName.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
