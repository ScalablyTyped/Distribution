package typings.victoryCore

import typings.victoryCore.libTypesPropTypesMod.AxisType
import typings.victoryCore.libTypesPropTypesMod.Datum
import typings.victoryCore.libTypesPropTypesMod.ForAxes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilTypeHelpersMod {
  
  @JSImport("victory-core/lib/victory-util/type-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValueForAxis[T](value: ForAxes[T] | T, axis: AxisType): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueForAxis")(value.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getValueForAxis[T](value: Unit, axis: AxisType): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueForAxis")(value.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def hasValueForAxis[T](value: Any | ForAxes[T], axis: AxisType): /* is victory-core.victory-core/lib/types/prop-types.ForAxes<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasValueForAxis")(value.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[/* is victory-core.victory-core/lib/types/prop-types.ForAxes<T> */ Boolean]
  
  inline def isDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isFunction[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")().asInstanceOf[/* is T */ Boolean]
  inline def isFunction[T](func: Any): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isKeyValueObject(datum: Datum): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyValueObject")(datum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTuple[T](value: Any): /* is victory-core.victory-core/lib/types/prop-types.Tuple<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuple")(value.asInstanceOf[js.Any]).asInstanceOf[/* is victory-core.victory-core/lib/types/prop-types.Tuple<T> */ Boolean]
}
