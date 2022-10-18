package typings.victoryCore

import typings.d3Scale.mod.ScaleLinear_
import typings.victoryCore.libTypesPropTypesMod.D3Scale
import typings.victoryCore.libTypesPropTypesMod.ScaleName
import typings.victoryCore.victoryCoreStrings.x
import typings.victoryCore.victoryCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilScaleMod {
  
  @JSImport("victory-core/lib/victory-util/scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseScale(props: Any, axis: x | y): D3Scale[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseScale")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[D3Scale[Any]]
  
  inline def getDefaultScale(): ScaleLinear_[Double, Double, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultScale")().asInstanceOf[ScaleLinear_[Double, Double, scala.Nothing]]
  
  inline def getScaleFromName(name: String): D3Scale[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleFromName")(name.asInstanceOf[js.Any]).asInstanceOf[D3Scale[Any]]
  inline def getScaleFromName(name: ScaleName): D3Scale[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleFromName")(name.asInstanceOf[js.Any]).asInstanceOf[D3Scale[Any]]
  
  inline def getScaleFromProps(props: Any, axis: Any): js.UndefOr[D3Scale[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaleFromProps")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[D3Scale[Any]]]
  
  inline def getScaleType(props: Any, axis: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaleType")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getType(scale: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(scale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def validScale(scale: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validScale(scale: D3Scale[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validScale")(scale.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
