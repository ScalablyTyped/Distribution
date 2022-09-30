package typings.victoryCore

import org.scalablytyped.runtime.StringDictionary
import typings.d3Scale.mod.ScaleLinear_
import typings.d3Scale.mod.ScaleLogarithmic
import typings.d3Scale.mod.ScalePower
import typings.d3Scale.mod.ScaleTime_
import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.victoryCore.anon.After
import typings.victoryCore.anon.Before
import typings.victoryCore.anon.ValueOf
import typings.victoryCore.anon.`4`
import typings.victoryCore.callbacksMod.StringOrNumberOrCallback
import typings.victoryCore.victoryAnimationMod.AnimationEasing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propTypesMod {
  
  trait AnimatePropTypeInterface extends StObject {
    
    var animationWhitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[AnimationEasing] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEnter: js.UndefOr[After] = js.undefined
    
    var onExit: js.UndefOr[Before] = js.undefined
    
    var onLoad: js.UndefOr[After] = js.undefined
  }
  object AnimatePropTypeInterface {
    
    inline def apply(): AnimatePropTypeInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatePropTypeInterface]
    }
    
    extension [Self <: AnimatePropTypeInterface](x: Self) {
      
      inline def setAnimationWhitelist(value: js.Array[String]): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
      
      inline def setAnimationWhitelistUndefined: Self = StObject.set(x, "animationWhitelist", js.undefined)
      
      inline def setAnimationWhitelistVarargs(value: String*): Self = StObject.set(x, "animationWhitelist", js.Array(value*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: AnimationEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnEnter(value: After): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnExit(value: Before): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnLoad(value: After): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.x
    - typings.victoryCore.victoryCoreStrings.y
  */
  trait AxisType extends StObject
  object AxisType {
    
    inline def x: typings.victoryCore.victoryCoreStrings.x = "x".asInstanceOf[typings.victoryCore.victoryCoreStrings.x]
    
    inline def y: typings.victoryCore.victoryCoreStrings.y = "y".asInstanceOf[typings.victoryCore.victoryCoreStrings.y]
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.Array[java.lang.String]
    - typings.victoryCore.anon.`5`
    - typings.victoryCore.anon.`6`
    - typings.victoryCore.anon.XArrayYArray
  */
  type CategoryPropType = _CategoryPropType | js.Array[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.grayscale
    - typings.victoryCore.victoryCoreStrings.qualitative
    - typings.victoryCore.victoryCoreStrings.heatmap
    - typings.victoryCore.victoryCoreStrings.warm
    - typings.victoryCore.victoryCoreStrings.cool
    - typings.victoryCore.victoryCoreStrings.red
    - typings.victoryCore.victoryCoreStrings.green
    - typings.victoryCore.victoryCoreStrings.blue
    - js.Array[java.lang.String]
  */
  type ColorScalePropType = _ColorScalePropType | js.Array[String]
  
  trait CoordinatesPropType extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object CoordinatesPropType {
    
    inline def apply(x: Double, y: Double): CoordinatesPropType = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinatesPropType]
    }
    
    extension [Self <: CoordinatesPropType](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait D3Scale[TRange] extends StObject {
    
    def apply(numberValue: NumberValue): Double = js.native
    
    var base: js.UndefOr[js.Function0[Double]] = js.native
    
    def copy(): this.type = js.native
    
    def domain(): js.Array[Double] = js.native
    def domain(domain: js.Array[NumberValue]): D3Scale[TRange] = js.native
    
    def invert(value: Double): Double = js.native
    
    def range(): js.Array[TRange] = js.native
    def range(range: TRange): D3Scale[TRange] = js.native
    
    def tickFormat(): js.Function1[/* d */ Double, String] = js.native
    def tickFormat(count: Double): js.Function1[/* d */ Double, String] = js.native
    
    def ticks(): js.Array[Double] = js.native
    def ticks(count: Double): js.Array[Double] = js.native
  }
  
  type D3ScaleFn[TRange, TOutput] = js.Function0[
    (ScaleLinear_[TRange, TOutput, Any]) | (ScaleLogarithmic[TRange, TOutput, Any]) | (ScaleTime_[TRange, TOutput, Any]) | (ScalePower[TRange, TOutput, Any])
  ]
  
  type DataGetterPropType = ValueOrAccessor[String | (js.Array[Double | String]) | Double, Any]
  
  type Datum = Any
  
  type DatumValue = js.UndefOr[Double | String | js.Date | Null]
  
  type DomainPaddingPropType = ValueOrAxes[PaddingType]
  
  type DomainPropType = ValueOrAxes[DomainTuple]
  
  type DomainTuple = Tuple[js.Date | Double]
  
  type DomainValue = Double | js.Date
  
  trait EventCallbackInterface[TTarget, TEventKey] extends StObject {
    
    var callback: js.UndefOr[js.Function1[/* props */ Any, Any]] = js.undefined
    
    var childName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var eventKey: js.UndefOr[TEventKey] = js.undefined
    
    def mutation(props: Any): Any
    
    var target: js.UndefOr[TTarget] = js.undefined
  }
  object EventCallbackInterface {
    
    inline def apply[TTarget, TEventKey](mutation: Any => Any): EventCallbackInterface[TTarget, TEventKey] = {
      val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction1(mutation))
      __obj.asInstanceOf[EventCallbackInterface[TTarget, TEventKey]]
    }
    
    extension [Self <: EventCallbackInterface[?, ?], TTarget, TEventKey](x: Self & (EventCallbackInterface[TTarget, TEventKey])) {
      
      inline def setCallback(value: /* props */ Any => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChildName(value: String | js.Array[String]): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
      
      inline def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
      
      inline def setChildNameVarargs(value: String*): Self = StObject.set(x, "childName", js.Array(value*))
      
      inline def setEventKey(value: TEventKey): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setMutation(value: Any => Any): Self = StObject.set(x, "mutation", js.Any.fromFunction1(value))
      
      inline def setTarget(value: TTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait EventPropTypeInterface[TTarget, TEventKey] extends StObject {
    
    var childName: js.UndefOr[String | js.Array[StringOrNumberOrCallback]] = js.undefined
    
    var eventHandlers: StringDictionary[
        js.Function2[
          /* event */ SyntheticEvent[Any, Event], 
          js.UndefOr[Any], 
          (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey]) | Unit
        ]
      ]
    
    var eventKey: js.UndefOr[TEventKey] = js.undefined
    
    var target: TTarget
  }
  object EventPropTypeInterface {
    
    inline def apply[TTarget, TEventKey](
      eventHandlers: StringDictionary[
          js.Function2[
            /* event */ SyntheticEvent[Any, Event], 
            js.UndefOr[Any], 
            (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey]) | Unit
          ]
        ],
      target: TTarget
    ): EventPropTypeInterface[TTarget, TEventKey] = {
      val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPropTypeInterface[TTarget, TEventKey]]
    }
    
    extension [Self <: EventPropTypeInterface[?, ?], TTarget, TEventKey](x: Self & (EventPropTypeInterface[TTarget, TEventKey])) {
      
      inline def setChildName(value: String | js.Array[StringOrNumberOrCallback]): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
      
      inline def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
      
      inline def setChildNameVarargs(value: StringOrNumberOrCallback*): Self = StObject.set(x, "childName", js.Array(value*))
      
      inline def setEventHandlers(
        value: StringDictionary[
              js.Function2[
                /* event */ SyntheticEvent[Any, Event], 
                js.UndefOr[Any], 
                (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey]) | Unit
              ]
            ]
      ): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventKey(value: TEventKey): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setTarget(value: TTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type ForAxes[T] = T | `4`[T]
  
  type ID = Double | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.basis
    - typings.victoryCore.victoryCoreStrings.basisClosed
    - typings.victoryCore.victoryCoreStrings.basisOpen
    - typings.victoryCore.victoryCoreStrings.bundle
    - typings.victoryCore.victoryCoreStrings.cardinal
    - typings.victoryCore.victoryCoreStrings.cardinalClosed
    - typings.victoryCore.victoryCoreStrings.cardinalOpen
    - typings.victoryCore.victoryCoreStrings.catmullRom
    - typings.victoryCore.victoryCoreStrings.catmullRomClosed
    - typings.victoryCore.victoryCoreStrings.catmullRomOpen
    - typings.victoryCore.victoryCoreStrings.linear
    - typings.victoryCore.victoryCoreStrings.linearClosed
    - typings.victoryCore.victoryCoreStrings.monotoneX
    - typings.victoryCore.victoryCoreStrings.monotoneY
    - typings.victoryCore.victoryCoreStrings.natural
    - typings.victoryCore.victoryCoreStrings.radial
    - typings.victoryCore.victoryCoreStrings.step
    - typings.victoryCore.victoryCoreStrings.stepAfter
    - typings.victoryCore.victoryCoreStrings.stepBefore
  */
  trait InterpolationPropType extends StObject
  object InterpolationPropType {
    
    inline def basis: typings.victoryCore.victoryCoreStrings.basis = "basis".asInstanceOf[typings.victoryCore.victoryCoreStrings.basis]
    
    inline def basisClosed: typings.victoryCore.victoryCoreStrings.basisClosed = "basisClosed".asInstanceOf[typings.victoryCore.victoryCoreStrings.basisClosed]
    
    inline def basisOpen: typings.victoryCore.victoryCoreStrings.basisOpen = "basisOpen".asInstanceOf[typings.victoryCore.victoryCoreStrings.basisOpen]
    
    inline def bundle: typings.victoryCore.victoryCoreStrings.bundle = "bundle".asInstanceOf[typings.victoryCore.victoryCoreStrings.bundle]
    
    inline def cardinal: typings.victoryCore.victoryCoreStrings.cardinal = "cardinal".asInstanceOf[typings.victoryCore.victoryCoreStrings.cardinal]
    
    inline def cardinalClosed: typings.victoryCore.victoryCoreStrings.cardinalClosed = "cardinalClosed".asInstanceOf[typings.victoryCore.victoryCoreStrings.cardinalClosed]
    
    inline def cardinalOpen: typings.victoryCore.victoryCoreStrings.cardinalOpen = "cardinalOpen".asInstanceOf[typings.victoryCore.victoryCoreStrings.cardinalOpen]
    
    inline def catmullRom: typings.victoryCore.victoryCoreStrings.catmullRom = "catmullRom".asInstanceOf[typings.victoryCore.victoryCoreStrings.catmullRom]
    
    inline def catmullRomClosed: typings.victoryCore.victoryCoreStrings.catmullRomClosed = "catmullRomClosed".asInstanceOf[typings.victoryCore.victoryCoreStrings.catmullRomClosed]
    
    inline def catmullRomOpen: typings.victoryCore.victoryCoreStrings.catmullRomOpen = "catmullRomOpen".asInstanceOf[typings.victoryCore.victoryCoreStrings.catmullRomOpen]
    
    inline def linear: typings.victoryCore.victoryCoreStrings.linear = "linear".asInstanceOf[typings.victoryCore.victoryCoreStrings.linear]
    
    inline def linearClosed: typings.victoryCore.victoryCoreStrings.linearClosed = "linearClosed".asInstanceOf[typings.victoryCore.victoryCoreStrings.linearClosed]
    
    inline def monotoneX: typings.victoryCore.victoryCoreStrings.monotoneX = "monotoneX".asInstanceOf[typings.victoryCore.victoryCoreStrings.monotoneX]
    
    inline def monotoneY: typings.victoryCore.victoryCoreStrings.monotoneY = "monotoneY".asInstanceOf[typings.victoryCore.victoryCoreStrings.monotoneY]
    
    inline def natural: typings.victoryCore.victoryCoreStrings.natural = "natural".asInstanceOf[typings.victoryCore.victoryCoreStrings.natural]
    
    inline def radial: typings.victoryCore.victoryCoreStrings.radial = "radial".asInstanceOf[typings.victoryCore.victoryCoreStrings.radial]
    
    inline def step: typings.victoryCore.victoryCoreStrings.step = "step".asInstanceOf[typings.victoryCore.victoryCoreStrings.step]
    
    inline def stepAfter: typings.victoryCore.victoryCoreStrings.stepAfter = "stepAfter".asInstanceOf[typings.victoryCore.victoryCoreStrings.stepAfter]
    
    inline def stepBefore: typings.victoryCore.victoryCoreStrings.stepBefore = "stepBefore".asInstanceOf[typings.victoryCore.victoryCoreStrings.stepBefore]
  }
  
  type NumberValue = Double | ValueOf
  
  trait Padding extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Padding {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Padding]
    }
    
    extension [Self <: Padding](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type PaddingType = Double | Tuple[Double]
  
  type RangePropType = ValueOrAxes[RangeTuple]
  
  type RangeTuple = js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.linear
    - typings.victoryCore.victoryCoreStrings.time
    - typings.victoryCore.victoryCoreStrings.log
    - typings.victoryCore.victoryCoreStrings.sqrt
  */
  trait ScaleName extends StObject
  object ScaleName {
    
    inline def linear: typings.victoryCore.victoryCoreStrings.linear = "linear".asInstanceOf[typings.victoryCore.victoryCoreStrings.linear]
    
    inline def log: typings.victoryCore.victoryCoreStrings.log = "log".asInstanceOf[typings.victoryCore.victoryCoreStrings.log]
    
    inline def sqrt: typings.victoryCore.victoryCoreStrings.sqrt = "sqrt".asInstanceOf[typings.victoryCore.victoryCoreStrings.sqrt]
    
    inline def time: typings.victoryCore.victoryCoreStrings.time = "time".asInstanceOf[typings.victoryCore.victoryCoreStrings.time]
  }
  
  type ScalePropType = ScaleName
  
  trait ScaleXYPropType extends StObject {
    
    var x: D3Scale[Any]
    
    var y: D3Scale[Any]
  }
  object ScaleXYPropType {
    
    inline def apply(x: D3Scale[Any], y: D3Scale[Any]): ScaleXYPropType = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleXYPropType]
    }
    
    extension [Self <: ScaleXYPropType](x: Self) {
      
      inline def setX(value: D3Scale[Any]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: D3Scale[Any]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.ascending
    - typings.victoryCore.victoryCoreStrings.descending
  */
  trait SortOrderPropType extends StObject
  object SortOrderPropType {
    
    inline def ascending: typings.victoryCore.victoryCoreStrings.ascending = "ascending".asInstanceOf[typings.victoryCore.victoryCoreStrings.ascending]
    
    inline def descending: typings.victoryCore.victoryCoreStrings.descending = "descending".asInstanceOf[typings.victoryCore.victoryCoreStrings.descending]
  }
  
  type StringOrNumberOrList = String | Double | (js.Array[String | Double])
  
  type Tuple[T] = js.Tuple2[T, T]
  
  type ValueOrAccessor[ValueType, PropsType] = ValueType | (js.Function1[/* props */ PropsType, ValueType])
  
  type ValueOrAxes[T] = T | ForAxes[T]
  
  trait VictoryLabelableProps extends StObject {
    
    var labelComponent: js.UndefOr[ReactElement] = js.undefined
  }
  object VictoryLabelableProps {
    
    inline def apply(): VictoryLabelableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryLabelableProps]
    }
    
    extension [Self <: VictoryLabelableProps](x: Self) {
      
      inline def setLabelComponent(value: ReactElement): Self = StObject.set(x, "labelComponent", value.asInstanceOf[js.Any])
      
      inline def setLabelComponentUndefined: Self = StObject.set(x, "labelComponent", js.undefined)
    }
  }
  
  trait VictoryMultiLabelableProps
    extends StObject
       with VictoryLabelableProps {
    
    var labels: js.UndefOr[
        (js.Array[Double | String]) | (js.Function1[/* data */ Any, String | (js.Array[Double | String]) | Double | Null])
      ] = js.undefined
  }
  object VictoryMultiLabelableProps {
    
    inline def apply(): VictoryMultiLabelableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryMultiLabelableProps]
    }
    
    extension [Self <: VictoryMultiLabelableProps](x: Self) {
      
      inline def setLabels(
        value: (js.Array[Double | String]) | (js.Function1[/* data */ Any, String | (js.Array[Double | String]) | Double | Null])
      ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsFunction1(value: /* data */ Any => String | (js.Array[Double | String]) | Double | Null): Self = StObject.set(x, "labels", js.Any.fromFunction1(value))
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: (Double | String)*): Self = StObject.set(x, "labels", js.Array(value*))
    }
  }
  
  trait VictorySingleLabelableProps
    extends StObject
       with VictoryLabelableProps {
    
    var label: js.UndefOr[String | (js.Function1[/* data */ Any, String | Double | Null])] = js.undefined
  }
  object VictorySingleLabelableProps {
    
    inline def apply(): VictorySingleLabelableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictorySingleLabelableProps]
    }
    
    extension [Self <: VictorySingleLabelableProps](x: Self) {
      
      inline def setLabel(value: String | (js.Function1[/* data */ Any, String | Double | Null])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: /* data */ Any => String | Double | Null): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait _CategoryPropType extends StObject
  object _CategoryPropType {
    
    inline def `5`(x: js.Array[String]): typings.victoryCore.anon.`5` = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.victoryCore.anon.`5`]
    }
    
    inline def `6`(y: js.Array[String]): typings.victoryCore.anon.`6` = {
      val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.victoryCore.anon.`6`]
    }
    
    inline def XArrayYArray(x: js.Array[String], y: js.Array[String]): typings.victoryCore.anon.XArrayYArray = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.victoryCore.anon.XArrayYArray]
    }
  }
  
  trait _ColorScalePropType extends StObject
}
