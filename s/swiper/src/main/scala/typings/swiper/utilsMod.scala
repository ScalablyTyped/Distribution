package typings.swiper

import typings.swiper.anon.Enabled
import typings.swiper.swiperBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("swiper/angular/angular/src/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coerceBooleanProperty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceBooleanProperty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def extend(target: Any, src: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("swiper/angular/angular/src/utils/utils", "ignoreNgOnChanges")
  @js.native
  val ignoreNgOnChanges: js.Array[String] = js.native
  
  inline def isEnabled(`val`: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isEnabled(`val`: Enabled): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isShowEl(`val`: Any, obj: Any, el: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isShowEl")(`val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setProperty(`val`: Any): js.Object | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Object | `false`]
  inline def setProperty(`val`: Any, obj: js.Object): js.Object | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(`val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object | `false`]
}
