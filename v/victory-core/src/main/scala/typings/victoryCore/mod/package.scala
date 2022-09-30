package typings.victoryCore.mod

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.victoryCore.addEventsMod.EventMixinCommonProps
import typings.victoryCore.addEventsMod.MixinOptions
import typings.victoryCore.addEventsMod.WrappedComponentClass
import typings.victoryCore.anon.AnimationTimer
import typings.victoryCore.anon.Instantiable
import typings.victoryCore.commonPropsMod.VictoryCommonPrimitiveProps
import typings.victoryCore.mod.^
import typings.victoryCore.portalContextMod.PortalContextValue
import typings.victoryCore.typesMod.VictoryPrimitiveShapeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Circle(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def Line(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Line")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def Path(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Path")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def PortalContext: Context[PortalContextValue] = ^.asInstanceOf[js.Dynamic].selectDynamic("PortalContext").asInstanceOf[Context[PortalContextValue]]

inline def Rect(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Rect")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def TSpan(props: VictoryCommonPrimitiveProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TSpan")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * The React context object consumers may use to access or override the global
  * timer.
  */
inline def TimerContext: Context[AnimationTimer] = ^.asInstanceOf[js.Dynamic].selectDynamic("TimerContext").asInstanceOf[Context[AnimationTimer]]

inline def addEvents[TBase /* <: WrappedComponentClass[TProps] */, TProps /* <: EventMixinCommonProps */](WrappedComponent: TBase): Instantiable[TProps] & TBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable[TProps] & TBase]
inline def addEvents[TBase /* <: WrappedComponentClass[TProps] */, TProps /* <: EventMixinCommonProps */](WrappedComponent: TBase, options: MixinOptions): Instantiable[TProps] & TBase = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instantiable[TProps] & TBase]
