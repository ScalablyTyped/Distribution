package typings.victoryCore

import typings.d3Scale.mod.ScaleLinear_
import typings.d3Shape.mod.LineRadial_
import typings.d3Shape.mod.Line_
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import typings.std.SVGElement
import typings.victoryCore.addEventsMod.EventMixinCommonProps
import typings.victoryCore.addEventsMod.MixinOptions
import typings.victoryCore.addEventsMod.WrappedComponentClass
import typings.victoryCore.anon.Angle
import typings.victoryCore.anon.AnimationTimer
import typings.victoryCore.anon.ChildComponents
import typings.victoryCore.anon.ChildrenTransitions
import typings.victoryCore.anon.GetAnimationProps
import typings.victoryCore.anon.Instantiable
import typings.victoryCore.anon.Labels
import typings.victoryCore.anon.Left
import typings.victoryCore.anon.PickSyntheticEventElement
import typings.victoryCore.anon.PickVictoryCommonPropssca
import typings.victoryCore.anon.WeakValidationMapVictoryC
import typings.victoryCore.anon.WeakValidationMapVictoryCActive
import typings.victoryCore.anon.WeakValidationMapVictoryD
import typings.victoryCore.anon.Width
import typings.victoryCore.anon.X0
import typings.victoryCore.anon.XAny
import typings.victoryCore.anon.XArray
import typings.victoryCore.anon.XNumber
import typings.victoryCore.anon.YArray
import typings.victoryCore.anon.`1`
import typings.victoryCore.anon.`2`
import typings.victoryCore.callbacksMod.CallbackArgs
import typings.victoryCore.eventsMod.ComponentEventHandlers
import typings.victoryCore.eventsMod.ComponentEventKey
import typings.victoryCore.eventsMod.PartialEvents
import typings.victoryCore.propTypesMod.AnimatePropTypeInterface
import typings.victoryCore.propTypesMod.D3Scale
import typings.victoryCore.propTypesMod.DomainPropType
import typings.victoryCore.propTypesMod.ScaleName
import typings.victoryCore.propTypesMod.ScaleXYPropType
import typings.victoryCore.propTypesMod.ValueOrAccessor
import typings.victoryCore.selectionMod.ComputedCommonProps
import typings.victoryCore.selectionMod.SVGCoordinateBounds
import typings.victoryCore.selectionMod.SVGCoordinateType
import typings.victoryCore.textsizeMod.TextSizeStyleInterface
import typings.victoryCore.timerMod.default
import typings.victoryCore.transitionsMod.TransitionProps
import typings.victoryCore.useAnimationStateMod.AnimationState
import typings.victoryCore.userPropsMod.SafeAttribute
import typings.victoryCore.victoryCoreStrings.end
import typings.victoryCore.victoryCoreStrings.middle
import typings.victoryCore.victoryCoreStrings.negative
import typings.victoryCore.victoryCoreStrings.positive
import typings.victoryCore.victoryCoreStrings.start
import typings.victoryCore.victoryCoreStrings.x
import typings.victoryCore.victoryCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object victoryUtilMod {
  
  @JSImport("victory-core/lib/victory-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Axis {
    
    @JSImport("victory-core/lib/victory-util", "Axis")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findAxisComponents(childComponents: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findAxisComponents")(childComponents.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def findAxisComponents(childComponents: Any, predicate: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findAxisComponents")(childComponents.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getAxis(props: Any): x | y = ^.asInstanceOf[js.Dynamic].applyDynamic("getAxis")(props.asInstanceOf[js.Any]).asInstanceOf[x | y]
    
    inline def getAxisComponent(childComponents: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisComponent")(childComponents.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getAxisComponentsWithParent(childComponents: Any, `type`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisComponentsWithParent")(childComponents.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getAxisValue(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisValue")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDomain(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def getDomain(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getOrigin(domain: Any): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrigin")(domain.asInstanceOf[js.Any]).asInstanceOf[`1`]
    
    inline def getOriginSign(origin: Any, domain: Any): positive | negative = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginSign")(origin.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[positive | negative]
    
    inline def getTickFormat(props: Any, scale: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickFormat")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getTicks(props: Any, scale: D3Scale[Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTicks")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def getTicks(props: Any, scale: D3Scale[Any], filterZero: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTicks")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], filterZero.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def isVertical(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def modifyProps(props: Any, fallbackProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def stringTicks(props: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stringTicks")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object Collection {
    
    @JSImport("victory-core/lib/victory-util", "Collection")
    @js.native
    val ^ : js.Any = js.native
    
    inline def containsDates(collection: js.Array[Double | js.Date]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsDates")(collection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def containsNumbers(collection: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsNumbers")(collection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def containsOnlyStrings(collection: js.Array[String]): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsOnlyStrings")(collection.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
    inline def containsOnlyStrings(collection: Any): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsOnlyStrings")(collection.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
    
    inline def containsStrings[T](collection: js.Array[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsStrings")(collection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getMaxValue(arr: js.Array[Double | js.Date], values: (Double | js.Date)*): Double | js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxValue")(scala.List(arr.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double | js.Date]
    
    inline def getMinValue(arr: js.Array[Double | js.Date], values: (Double | js.Date)*): Double | js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinValue")(scala.List(arr.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double | js.Date]
    
    inline def isArrayOfArrays[T](collection: js.Array[js.Array[T] | T]): /* is std.Array<std.Array<T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(collection.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.Array<T>> */ Boolean]
    inline def isArrayOfArrays[T](collection: Any): /* is std.Array<std.Array<T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(collection.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.Array<T>> */ Boolean]
    
    inline def removeUndefined(arr: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUndefined")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  object CommonProps {
    
    @JSImport("victory-core/lib/victory-util", "CommonProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-util", "CommonProps.baseProps")
    @js.native
    def baseProps: WeakValidationMapVictoryC = js.native
    inline def baseProps_=(x: WeakValidationMapVictoryC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-util", "CommonProps.dataProps")
    @js.native
    def dataProps: WeakValidationMapVictoryD = js.native
    inline def dataProps_=(x: WeakValidationMapVictoryD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-util", "CommonProps.primitiveProps")
    @js.native
    def primitiveProps: WeakValidationMapVictoryCActive = js.native
    inline def primitiveProps_=(x: WeakValidationMapVictoryCActive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primitiveProps")(x.asInstanceOf[js.Any])
  }
  
  object Data {
    
    @JSImport("victory-core/lib/victory-util", "Data")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createStringMap(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createStringMap")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def downsample(data: Any, maxPoints: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("downsample")(data.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def downsample(data: Any, maxPoints: Any, startingIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("downsample")(data.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def formatData(dataset: js.Array[Any], props: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatData")(dataset.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def formatData(dataset: js.Array[Any], props: Any, expectedKeys: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatData")(dataset.asInstanceOf[js.Any], props.asInstanceOf[js.Any], expectedKeys.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def formatDataFromDomain(dataset: Any, domain: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDataFromDomain")(dataset.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def formatDataFromDomain(dataset: Any, domain: Any, defaultBaseline: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDataFromDomain")(dataset.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], defaultBaseline.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def generateData(props: Any): js.Array[XNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateData")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[XNumber]]
    
    inline def getCategories(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getData(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getStringsFromAxes(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromAxes")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getStringsFromCategories(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromCategories")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getStringsFromData(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromData")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def isDataComponent(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object DefaultTransitions {
    
    @JSImport("victory-core/lib/victory-util", "DefaultTransitions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def continuousPolarTransitions(): AnimatePropTypeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("continuousPolarTransitions")().asInstanceOf[AnimatePropTypeInterface]
    
    inline def continuousTransitions(): AnimatePropTypeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("continuousTransitions")().asInstanceOf[AnimatePropTypeInterface]
    
    inline def discreteTransitions(): AnimatePropTypeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("discreteTransitions")().asInstanceOf[AnimatePropTypeInterface]
  }
  
  object Domain {
    
    @JSImport("victory-core/lib/victory-util", "Domain")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createDomainFunction(): js.Function2[/* props */ Any, /* axis */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomainFunction")().asInstanceOf[js.Function2[/* props */ Any, /* axis */ Any, Any]]
    inline def createDomainFunction(getDomainFromDataFunction: Any): js.Function2[/* props */ Any, /* axis */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomainFunction")(getDomainFromDataFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* props */ Any, /* axis */ Any, Any]]
    inline def createDomainFunction(getDomainFromDataFunction: Any, formatDomainFunction: Any): js.Function2[/* props */ Any, /* axis */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDomainFunction")(getDomainFromDataFunction.asInstanceOf[js.Any], formatDomainFunction.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* props */ Any, /* axis */ Any, Any]]
    inline def createDomainFunction(getDomainFromDataFunction: Unit, formatDomainFunction: Any): js.Function2[/* props */ Any, /* axis */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDomainFunction")(getDomainFromDataFunction.asInstanceOf[js.Any], formatDomainFunction.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* props */ Any, /* axis */ Any, Any]]
    
    inline def formatDomain(domain: Any, props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDomain")(domain.asInstanceOf[js.Any], props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDomain(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDomainFromCategories(props: Any, axis: Any): js.UndefOr[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromCategories")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Any]]]
    inline def getDomainFromCategories(props: Any, axis: Any, categories: Any): js.UndefOr[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromCategories")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], categories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Any]]]
    
    inline def getDomainFromData(props: Any, axis: Any, dataset: Any): js.UndefOr[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromData")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Any]]]
    
    inline def getDomainFromMinMax(min: Any, max: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromMinMax")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def getDomainFromProps(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromProps")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDomainWithZero(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainWithZero")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getMaxFromProps(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxFromProps")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getMinFromProps(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinFromProps")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getSymmetricDomain(domain: Any, values: js.Array[Double]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymmetricDomain")(domain.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def isDomainComponent(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomainComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object Events {
    
    @JSImport("victory-core/lib/victory-util", "Events")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emulateReactEvent(event: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emulateReactEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getComponentEvents(props: Any, components: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentEvents")(props.asInstanceOf[js.Any], components.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getEventState(eventKey: ComponentEventKey, namespace: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventState")(eventKey.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getEventState(eventKey: ComponentEventKey, namespace: String, childType: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventState")(eventKey.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], childType.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getEvents(props: Any, target: Any, eventKey: Any, getScopedEvents: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEvents")(props.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventKey.asInstanceOf[js.Any], getScopedEvents.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getExternalMutation(mutations: Any, baseProps: Any, baseState: Any, identifier: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getExternalMutation")(mutations.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any], baseState.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getExternalMutations(mutations: Any, baseProps: Any, baseState: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getExternalMutations")(mutations.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any], baseState.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def getExternalMutations(mutations: Any, baseProps: Any, baseState: Any, childName: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getExternalMutations")(mutations.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any], baseState.asInstanceOf[js.Any], childName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def getExternalMutationsWithChildren(mutations: Any, baseProps: Any, baseState: Any, childNames: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getExternalMutationsWithChildren")(mutations.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any], baseState.asInstanceOf[js.Any], childNames.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getGlobalEventNameFromKey(key: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalEventNameFromKey")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getGlobalEvents(events: Any): Partial[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalEvents")(events.asInstanceOf[js.Any]).asInstanceOf[Partial[Any]]
    
    inline def getPartialEvents(events: ComponentEventHandlers, eventKey: ComponentEventKey, childProps: Any): PartialEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("getPartialEvents")(events.asInstanceOf[js.Any], eventKey.asInstanceOf[js.Any], childProps.asInstanceOf[js.Any])).asInstanceOf[PartialEvents]
    
    inline def getScopedEvents(events: Any, namespace: Any, childType: Any, baseProps: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getScopedEvents")(events.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], childType.asInstanceOf[js.Any], baseProps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def omitGlobalEvents(events: Any): Partial[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitGlobalEvents")(events.asInstanceOf[js.Any]).asInstanceOf[Partial[Any]]
  }
  
  object Helpers {
    
    @JSImport("victory-core/lib/victory-util", "Helpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createAccessor(key: Any): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccessor")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
    
    inline def degreesToRadians(degrees: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def evaluateProp[TValue](prop: ValueOrAccessor[TValue, CallbackArgs], props: CallbackArgs): TValue = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateProp")(prop.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[TValue]
    
    inline def evaluateStyle(style: Any, props: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateStyle")(style.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getCurrentAxis(axis: Any, horizontal: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentAxis")(axis.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDefaultStyles(props: Any, role: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStyles")(props.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getPadding(props: Any): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getPadding")(props.asInstanceOf[js.Any]).asInstanceOf[Left]
    inline def getPadding(props: Any, name: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getPadding")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Left]
    
    inline def getPoint(datum: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")(datum.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getPolarOrigin(props: Any): XNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolarOrigin")(props.asInstanceOf[js.Any]).asInstanceOf[XNumber]
    
    inline def getRadius(props: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadius")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getRange(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getStyles(style: Any, defaultStyles: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(style.asInstanceOf[js.Any], defaultStyles.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def isHorizontal(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isHorizontal")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isTooltip(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTooltip")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def modifyProps(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def modifyProps(props: Any, fallbackProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def modifyProps(props: Any, fallbackProps: Any, role: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def modifyProps(props: Any, fallbackProps: Unit, role: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def omit[T, Keys /* <: /* keyof T */ String */](originalObject: T): Omit[T, Keys] = ^.asInstanceOf[js.Dynamic].applyDynamic("omit")(originalObject.asInstanceOf[js.Any]).asInstanceOf[Omit[T, Keys]]
    inline def omit[T, Keys /* <: /* keyof T */ String */](originalObject: T, ks: js.Array[Keys]): Omit[T, Keys] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(originalObject.asInstanceOf[js.Any], ks.asInstanceOf[js.Any])).asInstanceOf[Omit[T, Keys]]
    
    inline def radiansToDegrees(radians: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("radiansToDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
      children: js.Array[TChildren],
      iteratee: js.Function3[
          /* child */ TChildren, 
          /* childName */ String, 
          /* parent */ js.UndefOr[TChildren], 
          TItem | Null
        ]
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
      children: js.Array[TChildren],
      iteratee: js.Function3[
          /* child */ TChildren, 
          /* childName */ String, 
          /* parent */ js.UndefOr[TChildren], 
          TItem | Null
        ],
      parentProps: js.Object
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
      children: js.Array[TChildren],
      iteratee: js.Function3[
          /* child */ TChildren, 
          /* childName */ String, 
          /* parent */ js.UndefOr[TChildren], 
          TItem | Null
        ],
      parentProps: js.Object,
      initialMemo: TResult
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
      children: js.Array[TChildren],
      iteratee: js.Function3[
          /* child */ TChildren, 
          /* childName */ String, 
          /* parent */ js.UndefOr[TChildren], 
          TItem | Null
        ],
      parentProps: js.Object,
      initialMemo: TResult,
      combine: js.Function2[/* memo */ TResult, /* item */ TItem, TResult]
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
      children: js.Array[TChildren],
      iteratee: js.Function3[
          /* child */ TChildren, 
          /* childName */ String, 
          /* parent */ js.UndefOr[TChildren], 
          TItem | Null
        ],
      parentProps: js.Object,
      initialMemo: Unit,
      combine: js.Function2[/* memo */ TResult, /* item */ TItem, TResult]
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
      children: js.Array[TChildren],
      iteratee: js.Function3[
          /* child */ TChildren, 
          /* childName */ String, 
          /* parent */ js.UndefOr[TChildren], 
          TItem | Null
        ],
      parentProps: Unit,
      initialMemo: TResult
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
      children: js.Array[TChildren],
      iteratee: js.Function3[
          /* child */ TChildren, 
          /* childName */ String, 
          /* parent */ js.UndefOr[TChildren], 
          TItem | Null
        ],
      parentProps: Unit,
      initialMemo: TResult,
      combine: js.Function2[/* memo */ TResult, /* item */ TItem, TResult]
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def reduceChildren[TChildren /* <: ReactNode */, TItem, TResult](
      children: js.Array[TChildren],
      iteratee: js.Function3[
          /* child */ TChildren, 
          /* childName */ String, 
          /* parent */ js.UndefOr[TChildren], 
          TItem | Null
        ],
      parentProps: Unit,
      initialMemo: Unit,
      combine: js.Function2[/* memo */ TResult, /* item */ TItem, TResult]
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChildren")(children.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], parentProps.asInstanceOf[js.Any], initialMemo.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[TResult]
    
    inline def scalePoint(props: Any, datum: Any): X0 = (^.asInstanceOf[js.Dynamic].applyDynamic("scalePoint")(props.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[X0]
  }
  
  object Hooks {
    
    @JSImport("victory-core/lib/victory-util", "Hooks")
    @js.native
    val ^ : js.Any = js.native
    
    inline def useAnimationState(): GetAnimationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationState")().asInstanceOf[GetAnimationProps]
    inline def useAnimationState(initialState: AnimationState): GetAnimationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationState")(initialState.asInstanceOf[js.Any]).asInstanceOf[GetAnimationProps]
    
    inline def usePreviousProps[T](props: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  }
  
  object Immutable {
    
    @JSImport("victory-core/lib/victory-util", "Immutable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-util", "Immutable.IMMUTABLE_ITERABLE")
    @js.native
    val IMMUTABLE_ITERABLE: /* "@@__IMMUTABLE_ITERABLE__@@" */ String = js.native
    
    @JSImport("victory-core/lib/victory-util", "Immutable.IMMUTABLE_LIST")
    @js.native
    val IMMUTABLE_LIST: /* "@@__IMMUTABLE_LIST__@@" */ String = js.native
    
    @JSImport("victory-core/lib/victory-util", "Immutable.IMMUTABLE_MAP")
    @js.native
    val IMMUTABLE_MAP: /* "@@__IMMUTABLE_MAP__@@" */ String = js.native
    
    @JSImport("victory-core/lib/victory-util", "Immutable.IMMUTABLE_RECORD")
    @js.native
    val IMMUTABLE_RECORD: /* "@@__IMMUTABLE_RECORD__@@" */ String = js.native
    
    inline def isImmutable(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isIterable(x: Any): /* is victory-core.victory-core/lib/victory-util/immutable-types.Iterable<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is victory-core.victory-core/lib/victory-util/immutable-types.Iterable<unknown, unknown> */ Boolean]
    
    inline def isList(x: Any): /* is victory-core.victory-core/lib/victory-util/immutable-types.List<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isList")(x.asInstanceOf[js.Any]).asInstanceOf[/* is victory-core.victory-core/lib/victory-util/immutable-types.List<unknown> */ Boolean]
    
    inline def isMap(x: Any): /* is victory-core.victory-core/lib/victory-util/immutable-types.Map<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(x.asInstanceOf[js.Any]).asInstanceOf[/* is victory-core.victory-core/lib/victory-util/immutable-types.Map<unknown, unknown> */ Boolean]
    
    inline def isRecord(x: Any): /* is std.Record<string, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecord")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, unknown> */ Boolean]
    
    inline def shallowToJS(x: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowToJS")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def shallowToJS(x: Any, whitelist: Record[String, Boolean | Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowToJS")(x.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object LabelHelpers {
    
    @JSImport("victory-core/lib/victory-util", "LabelHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDegrees(props: Any, datum: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDegrees")(props.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getPolarAngle(props: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolarAngle")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getPolarAngle(props: Any, baseAngle: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolarAngle")(props.asInstanceOf[js.Any], baseAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getPolarTextAnchor(props: Any, degrees: Any): end | start | middle = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolarTextAnchor")(props.asInstanceOf[js.Any], degrees.asInstanceOf[js.Any])).asInstanceOf[end | start | middle]
    
    inline def getPolarVerticalAnchor(props: Any, degrees: Any): end | start | middle = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolarVerticalAnchor")(props.asInstanceOf[js.Any], degrees.asInstanceOf[js.Any])).asInstanceOf[end | start | middle]
    
    inline def getProps(props: Any, index: Any): Angle = (^.asInstanceOf[js.Dynamic].applyDynamic("getProps")(props.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Angle]
    
    inline def getText(props: Any, datum: Any, index: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(props.asInstanceOf[js.Any], datum.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object LineHelpers {
    
    @JSImport("victory-core/lib/victory-util", "LineHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInterpolationFunction(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolationFunction")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getLineFunction(props: Any): (LineRadial_[js.Tuple2[Double, Double]]) | (Line_[js.Tuple2[Double, Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineFunction")(props.asInstanceOf[js.Any]).asInstanceOf[(LineRadial_[js.Tuple2[Double, Double]]) | (Line_[js.Tuple2[Double, Double]])]
  }
  
  object Log {
    
    @JSImport("victory-core/lib/victory-util", "Log")
    @js.native
    val ^ : js.Any = js.native
    
    inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object PointPathHelpers {
    
    @JSImport("victory-core/lib/victory-util", "PointPathHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def circle(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def cross(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def diamond(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diamond")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def minus(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("minus")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def plus(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("plus")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def square(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def star(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("star")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def triangleDown(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("triangleDown")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def triangleUp(x: Double, y: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("triangleUp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object PropTypes {
    
    @JSImport("victory-core/lib/victory-util", "PropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allOfType[T](validators: js.Array[Validator[T]]): Requireable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allOfType")(validators.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.UndefOr[T]]]
    
    inline def deprecated[T](propType: Validator[T], explanation: String): Validator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(propType.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[Validator[T]]
    
    @JSImport("victory-core/lib/victory-util", "PropTypes.domain")
    @js.native
    val domain: Requireable[js.UndefOr[js.Tuple2[Double, Double]]] = js.native
    
    @JSImport("victory-core/lib/victory-util", "PropTypes.greaterThanZero")
    @js.native
    val greaterThanZero: Requireable[js.UndefOr[Double]] = js.native
    
    @JSImport("victory-core/lib/victory-util", "PropTypes.homogeneousArray")
    @js.native
    val homogeneousArray: Requireable[js.UndefOr[js.Array[Any]]] = js.native
    
    @JSImport("victory-core/lib/victory-util", "PropTypes.integer")
    @js.native
    val integer: Requireable[js.UndefOr[Double]] = js.native
    
    @JSImport("victory-core/lib/victory-util", "PropTypes.matchDataLength")
    @js.native
    val matchDataLength: Requireable[js.UndefOr[js.Array[Any]]] = js.native
    
    @JSImport("victory-core/lib/victory-util", "PropTypes.nonNegative")
    @js.native
    val nonNegative: Requireable[js.UndefOr[Double]] = js.native
    
    @JSImport("victory-core/lib/victory-util", "PropTypes.regExp")
    @js.native
    val regExp: Requireable[js.UndefOr[js.RegExp]] = js.native
    
    @JSImport("victory-core/lib/victory-util", "PropTypes.scale")
    @js.native
    val scale: Requireable[js.UndefOr[ScaleName | D3Scale[Any]]] = js.native
  }
  
  object Scale {
    
    @JSImport("victory-core/lib/victory-util", "Scale")
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
  
  object Selection {
    
    @JSImport("victory-core/lib/victory-util", "Selection")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBounds(props: ComputedCommonProps): SVGCoordinateBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(props.asInstanceOf[js.Any]).asInstanceOf[SVGCoordinateBounds]
    
    inline def getDataCoordinates(props: Any, scale: ScaleXYPropType, x: Double, y: Double): SVGCoordinateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataCoordinates")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[SVGCoordinateType]
    
    inline def getDomainCoordinates(props: PickVictoryCommonPropssca): XArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainCoordinates")(props.asInstanceOf[js.Any]).asInstanceOf[XArray]
    inline def getDomainCoordinates(props: PickVictoryCommonPropssca, domain: DomainPropType): XArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainCoordinates")(props.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[XArray]
    
    inline def getParentSVG(evt: PickSyntheticEventElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentSVG")(evt.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
    
    inline def getSVGEventCoordinates(evt: SyntheticEvent[Element, Event]): SVGCoordinateType = ^.asInstanceOf[js.Dynamic].applyDynamic("getSVGEventCoordinates")(evt.asInstanceOf[js.Any]).asInstanceOf[SVGCoordinateType]
    inline def getSVGEventCoordinates(evt: SyntheticEvent[Element, Event], svg: SVGElement): SVGCoordinateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGEventCoordinates")(evt.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[SVGCoordinateType]
  }
  
  object Style {
    
    @JSImport("victory-core/lib/victory-util", "Style")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getColorScale(name: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorScale")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def toTransformString(obj: Any, more: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toTransformString")(scala.List(obj.asInstanceOf[js.Any]).`++`(more.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  }
  
  object TextSize {
    
    @JSImport("victory-core/lib/victory-util", "TextSize")
    @js.native
    val ^ : js.Any = js.native
    
    inline def approximateTextSize(text: String): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
    inline def approximateTextSize(text: String, style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
    inline def approximateTextSize(text: js.Array[String]): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
    inline def approximateTextSize(text: js.Array[String], style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
    
    object approximateTextSizeInternal {
      
      @JSImport("victory-core/lib/victory-util", "TextSize._approximateTextSizeInternal")
      @js.native
      val ^ : js.Any = js.native
      
      inline def impl(text: String): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
      inline def impl(text: String, style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
      inline def impl(text: js.Array[String]): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
      inline def impl(text: js.Array[String], style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
    }
    
    inline def convertLengthToPixels(length: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLengthToPixels")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def convertLengthToPixels(length: String, fontSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertLengthToPixels")(length.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("victory-core/lib/victory-util", "Timer")
  @js.native
  open class Timer () extends default
  
  /**
    * The React context object consumers may use to access or override the global
    * timer.
    */
  @JSImport("victory-core/lib/victory-util", "TimerContext")
  @js.native
  val TimerContext: Context[AnimationTimer] = js.native
  
  object Transitions {
    
    @JSImport("victory-core/lib/victory-util", "Transitions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInitialTransitionState(oldChildren: Any, nextChildren: Any): ChildrenTransitions = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialTransitionState")(oldChildren.asInstanceOf[js.Any], nextChildren.asInstanceOf[js.Any])).asInstanceOf[ChildrenTransitions]
    
    inline def getTransitionPropsFactory(props: Any, state: Any, setState: Any): js.Function2[/* child */ Any, /* index */ Any, TransitionProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionPropsFactory")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], setState.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* child */ Any, /* index */ Any, TransitionProps]]
  }
  
  object UserProps {
    
    @JSImport("victory-core/lib/victory-util", "UserProps")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getSafeUserProps[T](props: T): Record[SafeAttribute, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSafeUserProps")(props.asInstanceOf[js.Any]).asInstanceOf[Record[SafeAttribute, String]]
    
    inline def withSafeUserProps(component: ReactElement, props: Any): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("withSafeUserProps")(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  }
  
  object Wrapper {
    
    @JSImport("victory-core/lib/victory-util", "Wrapper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addBinsToParentPropsIfHistogram(hasChildrenPropsChildComponentsParentProps: ChildComponents): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addBinsToParentPropsIfHistogram")(hasChildrenPropsChildComponentsParentProps.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getAllEvents(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllEvents")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getCategories(props: Any, childComponents: Any): XAny = (^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[XAny]
    inline def getCategories(props: Any, childComponents: Any, allStrings: Any): XAny = (^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any], allStrings.asInstanceOf[js.Any])).asInstanceOf[XAny]
    
    inline def getCategoryAndAxisStringsFromChildren(props: Any, axis: Any, childComponents: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCategoryAndAxisStringsFromChildren")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def getChildStyle(child: Any, index: Any, calculatedProps: Any): js.Array[Any] | Labels = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildStyle")(child.asInstanceOf[js.Any], index.asInstanceOf[js.Any], calculatedProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any] | Labels]
    
    inline def getColor(calculatedProps: Any, child: Any, index: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getColor")(calculatedProps.asInstanceOf[js.Any], child.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getData(props: Any, childComponents: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDataFromChildren(props: Any, childComponents: Any): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataFromChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
    
    inline def getDefaultDomainPadding(props: Any, axis: Any, childComponents: Any): js.UndefOr[`2`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDomainPadding")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`2`]]
    
    inline def getDomain(props: Any, axis: Any, childComponents: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDomainFromChildren(props: Any, axis: Any, childComponents: Any): js.Array[Double | js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromChildren")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double | js.Date]]
    
    inline def getScale(props: Any, axis: Any): D3Scale[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[D3Scale[Any]]
    inline def getScale(props: Any, axis: Any, childComponents: Any): D3Scale[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[D3Scale[Any]]
    
    inline def getStringsFromCategories(childComponents: Any, axis: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromCategories")(childComponents.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def getStringsFromChildren(props: Any, childComponents: Any): YArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[YArray]
    
    inline def getStringsFromData(childComponents: Any): XArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromData")(childComponents.asInstanceOf[js.Any]).asInstanceOf[XArray]
    
    inline def getStyle(theme: Any, style: Any, role: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(theme.asInstanceOf[js.Any], style.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getWidth(props: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getWidth(props: Any, groupLength: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(props.asInstanceOf[js.Any], groupLength.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def getWidth(props: Any, groupLength: Any, seriesLength: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(props.asInstanceOf[js.Any], groupLength.asInstanceOf[js.Any], seriesLength.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def getWidth(props: Any, groupLength: Unit, seriesLength: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(props.asInstanceOf[js.Any], groupLength.asInstanceOf[js.Any], seriesLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def addEvents[TBase /* <: WrappedComponentClass[TProps] */, TProps /* <: EventMixinCommonProps */](WrappedComponent: TBase): Instantiable[TProps] & TBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable[TProps] & TBase]
  inline def addEvents[TBase /* <: WrappedComponentClass[TProps] */, TProps /* <: EventMixinCommonProps */](WrappedComponent: TBase, options: MixinOptions): Instantiable[TProps] & TBase = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instantiable[TProps] & TBase]
}
