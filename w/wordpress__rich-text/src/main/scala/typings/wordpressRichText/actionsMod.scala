package typings.wordpressRichText

import typings.wordpressRichText.mod.NamedFormatConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@wordpress/rich-text/store/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addFormatTypes(configs: js.Array[NamedFormatConfiguration]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFormatTypes")(configs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addFormatTypes(configs: NamedFormatConfiguration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFormatTypes")(configs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeFormatTypes(names: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFormatTypes")(names.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeFormatTypes(names: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFormatTypes")(names.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
