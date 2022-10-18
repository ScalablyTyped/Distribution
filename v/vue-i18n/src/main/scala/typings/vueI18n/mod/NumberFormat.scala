package typings.vueI18n.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NumberFormat {
  
  @JSImport("vue-i18n", "NumberFormat")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vue-i18n", "NumberFormat.name")
  @js.native
  def name: String = js.native
  inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  
  @JSImport("vue-i18n", "NumberFormat.props")
  @js.native
  def props: typings.vueI18n.anon.I18n = js.native
  inline def props_=(x: typings.vueI18n.anon.I18n): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("props")(x.asInstanceOf[js.Any])
  
  inline def setup(props: Any, context: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setup")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
}
