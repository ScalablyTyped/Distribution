package typings.victoryBoxPlot

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Requireable
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Pick
import typings.std.Record
import typings.victoryBoxPlot.victoryBoxPlotStrings.boxWidth
import typings.victoryBoxPlot.victoryBoxPlotStrings.datum
import typings.victoryBoxPlot.victoryBoxPlotStrings.domain
import typings.victoryBoxPlot.victoryBoxPlotStrings.domainPadding
import typings.victoryBoxPlot.victoryBoxPlotStrings.eventKey
import typings.victoryBoxPlot.victoryBoxPlotStrings.events
import typings.victoryBoxPlot.victoryBoxPlotStrings.horizontal
import typings.victoryBoxPlot.victoryBoxPlotStrings.labelOrientation
import typings.victoryBoxPlot.victoryBoxPlotStrings.labels
import typings.victoryBoxPlot.victoryBoxPlotStrings.max
import typings.victoryBoxPlot.victoryBoxPlotStrings.maxComponent
import typings.victoryBoxPlot.victoryBoxPlotStrings.maxLabelComponent
import typings.victoryBoxPlot.victoryBoxPlotStrings.maxLabels
import typings.victoryBoxPlot.victoryBoxPlotStrings.median
import typings.victoryBoxPlot.victoryBoxPlotStrings.medianComponent
import typings.victoryBoxPlot.victoryBoxPlotStrings.medianLabelComponent
import typings.victoryBoxPlot.victoryBoxPlotStrings.medianLabels
import typings.victoryBoxPlot.victoryBoxPlotStrings.min
import typings.victoryBoxPlot.victoryBoxPlotStrings.minComponent
import typings.victoryBoxPlot.victoryBoxPlotStrings.minLabelComponent
import typings.victoryBoxPlot.victoryBoxPlotStrings.minLabels
import typings.victoryBoxPlot.victoryBoxPlotStrings.q1
import typings.victoryBoxPlot.victoryBoxPlotStrings.q1Component
import typings.victoryBoxPlot.victoryBoxPlotStrings.q1LabelComponent
import typings.victoryBoxPlot.victoryBoxPlotStrings.q1Labels
import typings.victoryBoxPlot.victoryBoxPlotStrings.q3
import typings.victoryBoxPlot.victoryBoxPlotStrings.q3Component
import typings.victoryBoxPlot.victoryBoxPlotStrings.q3LabelComponent
import typings.victoryBoxPlot.victoryBoxPlotStrings.q3Labels
import typings.victoryBoxPlot.victoryBoxPlotStrings.style
import typings.victoryBoxPlot.victoryBoxPlotStrings.text
import typings.victoryBoxPlot.victoryBoxPlotStrings.whiskerWidth
import typings.victoryCore.libVictoryUtilEventsMod.ComponentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddGlobalListener extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* nextProps */ Any, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.Function3[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* nextProps */ Any, 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    def addGlobalListener(key: Any): Unit = js.native
    
    def animateComponent(
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any,
      defaultAnimationWhitelist: js.Array[String]
    ): ReactElement = js.native
    
    def applyExternalMutations(props: Any, externalMutations: Any): Unit = js.native
    
    var baseProps: Record[String, js.Object] = js.native
    
    def cacheValues(obj: Any): Unit = js.native
    
    var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    def componentDidMount(): Unit = js.native
    
    def componentDidUpdate(prevProps: Any): Unit = js.native
    
    var componentEvents: js.Array[ComponentEvent] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* nextProps */ Any, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    def componentWillUnmount(): Unit = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* nextProps */ Any, 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var context: Any = js.native
    
    var dataKeys: js.Array[String] = js.native
    
    var events: Any = js.native
    
    var externalMutations: js.UndefOr[js.Object] = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
    
    def getAllEvents(props: Any): Any = js.native
    
    def getBaseProps(props: Any, getSharedEventState: Any): Record[String, js.Object] = js.native
    
    def getCalculatedValues(props: Any): Any = js.native
    
    def getComponentProps(component: Any, `type`: Any, index: Any): Any = js.native
    
    def getEventState(eventKey: String, namespace: String): Any = js.native
    def getEventState(eventKey: String, namespace: String, childType: String): Any = js.native
    def getEventState(eventKey: Double, namespace: String): Any = js.native
    def getEventState(eventKey: Double, namespace: String, childType: String): Any = js.native
    
    def getEvents(p: Any, target: Any, eventKey: Any): Any = js.native
    
    def getExternalMutations(
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any
    ): js.UndefOr[js.Object] = js.native
    
    def getScopedEvents(events: Any, namespace: Any, childType: Any, baseProps: Any): js.Object = js.native
    
    def getSharedEventState(key: String, value: String): Any = js.native
    
    var getSnapshotBeforeUpdate: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* prevProps */ Any, 
          /* prevState */ js.Object, 
          Any
        ]
      ] = js.native
    
    def getStateChanges(props: Any): js.Object = js.native
    
    var hasEvents: Any = js.native
    
    var prevGlobalEventKeys: js.Array[String] = js.native
    
    val props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def removeGlobalListener(key: Any): Unit = js.native
    
    def render(): ReactNode = js.native
    
    def renderContainer(component: Any, children: Any): DetailedReactHTMLElement[Any, HTMLElement] = js.native
    
    def renderContinuousData(
      props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any
    ): DetailedReactHTMLElement[Any, HTMLElement] = js.native
    
    def renderData(props: Any): DetailedReactHTMLElement[Any, HTMLElement] = js.native
    def renderData(props: Any, shouldRenderDatum: js.Function1[/* datum */ Any, Boolean]): DetailedReactHTMLElement[Any, HTMLElement] = js.native
    
    def setState[K /* <: scala.Nothing */](): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K])): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K]), callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* props */ Any, 
          js.Object | (Pick[js.Object, K]) | Null
        ]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* props */ Any, 
          js.Object | (Pick[js.Object, K]) | Null
        ],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
    
    def shouldComponentUpdate(
      nextProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any
    ): Boolean = js.native
  }
  
  trait Animate extends StObject {
    
    var animate: js.UndefOr[
        Validator[
          js.UndefOr[
            Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var boxWidth: Requireable[Double]
    
    var categories: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.CategoryPropType */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var colorScale: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ColorScalePropType */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var containerComponent: js.UndefOr[Validator[js.UndefOr[ReactElement | Null]]] = js.undefined
    
    var data: js.UndefOr[Validator[js.UndefOr[js.Array[Any] | Null]]] = js.undefined
    
    var dataComponent: js.UndefOr[Validator[js.UndefOr[ReactElement | Null]]] = js.undefined
    
    var domain: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.DomainTuple> */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var domainPadding: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.PaddingType> */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var events: Requireable[js.Array[js.UndefOr[InferProps[EventHandlers] | Null]]]
    
    var externalEventMutations: js.UndefOr[
        Validator[
          js.UndefOr[
            (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
            ]) | Null
          ]
        ]
      ] = js.undefined
    
    var groupComponent: js.UndefOr[Validator[js.UndefOr[ReactElement | Null]]] = js.undefined
    
    var height: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
    
    var horizontal: Requireable[Boolean]
    
    var labelOrientation: Requireable[String | InferProps[Max]]
    
    var labels: Requireable[Boolean]
    
    var max: Requireable[
        String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
      ]
    
    var maxComponent: Requireable[ReactElementLike]
    
    var maxDomain: js.UndefOr[Validator[js.UndefOr[Double | X | Null]]] = js.undefined
    
    var maxLabelComponent: Requireable[ReactElementLike]
    
    var maxLabels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]
    
    var median: Requireable[
        String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
      ]
    
    var medianComponent: Requireable[ReactElementLike]
    
    var medianLabelComponent: Requireable[ReactElementLike]
    
    var medianLabels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]
    
    var min: Requireable[
        String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
      ]
    
    var minComponent: Requireable[ReactElementLike]
    
    var minDomain: js.UndefOr[Validator[js.UndefOr[Double | X | Null]]] = js.undefined
    
    var minLabelComponent: Requireable[ReactElementLike]
    
    var minLabels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]
    
    var name: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
    
    var origin: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.OriginType */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var padding: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.PaddingProps */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var polar: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
    
    var q1: Requireable[
        String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
      ]
    
    var q1Component: Requireable[ReactElementLike]
    
    var q1LabelComponent: Requireable[ReactElementLike]
    
    var q1Labels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]
    
    var q3: Requireable[
        String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
      ]
    
    var q3Component: Requireable[ReactElementLike]
    
    var q3LabelComponent: Requireable[ReactElementLike]
    
    var q3Labels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]
    
    var range: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.RangeTuple> */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var samples: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
    
    var scale: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | Y | Null
          ]
        ]
      ] = js.undefined
    
    var sharedEvents: js.UndefOr[Validator[js.UndefOr[Events | Null]]] = js.undefined
    
    var singleQuadrantDomainPadding: js.UndefOr[Validator[js.UndefOr[Boolean | XY | Null]]] = js.undefined
    
    var sortKey: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.DataGetterPropType */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var sortOrder: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.SortOrderPropType */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var standalone: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
    
    var style: Requireable[InferProps[Boxes]]
    
    var theme: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var whiskerWidth: Requireable[Double]
    
    var width: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
    
    var x: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.DataGetterPropType */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var y: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.DataGetterPropType */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var y0: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.DataGetterPropType */ Any) | Null
          ]
        ]
      ] = js.undefined
  }
  object Animate {
    
    inline def apply(
      boxWidth: Requireable[Double],
      events: Requireable[js.Array[js.UndefOr[InferProps[EventHandlers] | Null]]],
      horizontal: Requireable[Boolean],
      labelOrientation: Requireable[String | InferProps[Max]],
      labels: Requireable[Boolean],
      max: Requireable[
          String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
        ],
      maxComponent: Requireable[ReactElementLike],
      maxLabelComponent: Requireable[ReactElementLike],
      maxLabels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])],
      median: Requireable[
          String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
        ],
      medianComponent: Requireable[ReactElementLike],
      medianLabelComponent: Requireable[ReactElementLike],
      medianLabels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])],
      min: Requireable[
          String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
        ],
      minComponent: Requireable[ReactElementLike],
      minLabelComponent: Requireable[ReactElementLike],
      minLabels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])],
      q1: Requireable[
          String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
        ],
      q1Component: Requireable[ReactElementLike],
      q1LabelComponent: Requireable[ReactElementLike],
      q1Labels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])],
      q3: Requireable[
          String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
        ],
      q3Component: Requireable[ReactElementLike],
      q3LabelComponent: Requireable[ReactElementLike],
      q3Labels: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])],
      style: Requireable[InferProps[Boxes]],
      whiskerWidth: Requireable[Double]
    ): Animate = {
      val __obj = js.Dynamic.literal(boxWidth = boxWidth.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], labelOrientation = labelOrientation.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxComponent = maxComponent.asInstanceOf[js.Any], maxLabelComponent = maxLabelComponent.asInstanceOf[js.Any], maxLabels = maxLabels.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], medianComponent = medianComponent.asInstanceOf[js.Any], medianLabelComponent = medianLabelComponent.asInstanceOf[js.Any], medianLabels = medianLabels.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minComponent = minComponent.asInstanceOf[js.Any], minLabelComponent = minLabelComponent.asInstanceOf[js.Any], minLabels = minLabels.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q1Component = q1Component.asInstanceOf[js.Any], q1LabelComponent = q1LabelComponent.asInstanceOf[js.Any], q1Labels = q1Labels.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], q3Component = q3Component.asInstanceOf[js.Any], q3LabelComponent = q3LabelComponent.asInstanceOf[js.Any], q3Labels = q3Labels.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], whiskerWidth = whiskerWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animate] (val x: Self) extends AnyVal {
      
      inline def setAnimate(
        value: Validator[
              js.UndefOr[
                Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBoxWidth(value: Requireable[Double]): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
      
      inline def setCategories(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.CategoryPropType */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setColorScale(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ColorScalePropType */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
      
      inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
      
      inline def setContainerComponent(value: Validator[js.UndefOr[ReactElement | Null]]): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
      
      inline def setContainerComponentUndefined: Self = StObject.set(x, "containerComponent", js.undefined)
      
      inline def setData(value: Validator[js.UndefOr[js.Array[Any] | Null]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataComponent(value: Validator[js.UndefOr[ReactElement | Null]]): Self = StObject.set(x, "dataComponent", value.asInstanceOf[js.Any])
      
      inline def setDataComponentUndefined: Self = StObject.set(x, "dataComponent", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDomain(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.DomainTuple> */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainPadding(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.PaddingType> */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
      
      inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEvents(value: Requireable[js.Array[js.UndefOr[InferProps[EventHandlers] | Null]]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setExternalEventMutations(
        value: Validator[
              js.UndefOr[
                (js.Array[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
                ]) | Null
              ]
            ]
      ): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
      
      inline def setExternalEventMutationsUndefined: Self = StObject.set(x, "externalEventMutations", js.undefined)
      
      inline def setGroupComponent(value: Validator[js.UndefOr[ReactElement | Null]]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontal(value: Requireable[Boolean]): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setLabelOrientation(value: Requireable[String | InferProps[Max]]): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Requireable[Boolean]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setMax(
        value: Requireable[
              String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
            ]
      ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "maxComponent", value.asInstanceOf[js.Any])
      
      inline def setMaxDomain(value: Validator[js.UndefOr[Double | X | Null]]): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
      
      inline def setMaxDomainUndefined: Self = StObject.set(x, "maxDomain", js.undefined)
      
      inline def setMaxLabelComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "maxLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setMaxLabels(value: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "maxLabels", value.asInstanceOf[js.Any])
      
      inline def setMedian(
        value: Requireable[
              String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
            ]
      ): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMedianComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "medianComponent", value.asInstanceOf[js.Any])
      
      inline def setMedianLabelComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "medianLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setMedianLabels(value: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "medianLabels", value.asInstanceOf[js.Any])
      
      inline def setMin(
        value: Requireable[
              String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
            ]
      ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "minComponent", value.asInstanceOf[js.Any])
      
      inline def setMinDomain(value: Validator[js.UndefOr[Double | X | Null]]): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
      
      inline def setMinDomainUndefined: Self = StObject.set(x, "minDomain", js.undefined)
      
      inline def setMinLabelComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "minLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setMinLabels(value: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "minLabels", value.asInstanceOf[js.Any])
      
      inline def setName(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrigin(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.OriginType */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPadding(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.PaddingProps */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPolar(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
      
      inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
      
      inline def setQ1(
        value: Requireable[
              String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
            ]
      ): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
      
      inline def setQ1Component(value: Requireable[ReactElementLike]): Self = StObject.set(x, "q1Component", value.asInstanceOf[js.Any])
      
      inline def setQ1LabelComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "q1LabelComponent", value.asInstanceOf[js.Any])
      
      inline def setQ1Labels(value: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "q1Labels", value.asInstanceOf[js.Any])
      
      inline def setQ3(
        value: Requireable[
              String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
            ]
      ): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
      
      inline def setQ3Component(value: Requireable[ReactElementLike]): Self = StObject.set(x, "q3Component", value.asInstanceOf[js.Any])
      
      inline def setQ3LabelComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "q3LabelComponent", value.asInstanceOf[js.Any])
      
      inline def setQ3Labels(value: Requireable[Boolean | js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "q3Labels", value.asInstanceOf[js.Any])
      
      inline def setRange(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.RangeTuple> */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSamples(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
      
      inline def setScale(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | Y | Null
              ]
            ]
      ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSharedEvents(value: Validator[js.UndefOr[Events | Null]]): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
      
      inline def setSharedEventsUndefined: Self = StObject.set(x, "sharedEvents", js.undefined)
      
      inline def setSingleQuadrantDomainPadding(value: Validator[js.UndefOr[Boolean | XY | Null]]): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
      
      inline def setSingleQuadrantDomainPaddingUndefined: Self = StObject.set(x, "singleQuadrantDomainPadding", js.undefined)
      
      inline def setSortKey(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.DataGetterPropType */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
      
      inline def setSortOrder(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.SortOrderPropType */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setStandalone(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setStyle(value: Requireable[InferProps[Boxes]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTheme(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWhiskerWidth(value: Requireable[Double]): Self = StObject.set(x, "whiskerWidth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.DataGetterPropType */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.DataGetterPropType */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.DataGetterPropType */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Boxes extends StObject {
    
    var boxes: Requireable[js.Object]
    
    var labels: Requireable[js.Object]
    
    var max: Requireable[js.Object]
    
    var maxLabels: Requireable[js.Object]
    
    var median: Requireable[js.Object]
    
    var medianLabels: Requireable[js.Object]
    
    var min: Requireable[js.Object]
    
    var minLabels: Requireable[js.Object]
    
    var parent: Requireable[js.Object]
    
    var q1: Requireable[js.Object]
    
    var q1Labels: Requireable[js.Object]
    
    var q3: Requireable[js.Object]
    
    var q3Labels: Requireable[js.Object]
    
    var whiskers: Requireable[js.Object]
  }
  object Boxes {
    
    inline def apply(
      boxes: Requireable[js.Object],
      labels: Requireable[js.Object],
      max: Requireable[js.Object],
      maxLabels: Requireable[js.Object],
      median: Requireable[js.Object],
      medianLabels: Requireable[js.Object],
      min: Requireable[js.Object],
      minLabels: Requireable[js.Object],
      parent: Requireable[js.Object],
      q1: Requireable[js.Object],
      q1Labels: Requireable[js.Object],
      q3: Requireable[js.Object],
      q3Labels: Requireable[js.Object],
      whiskers: Requireable[js.Object]
    ): Boxes = {
      val __obj = js.Dynamic.literal(boxes = boxes.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLabels = maxLabels.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], medianLabels = medianLabels.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minLabels = minLabels.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q1Labels = q1Labels.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], q3Labels = q3Labels.asInstanceOf[js.Any], whiskers = whiskers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Boxes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Boxes] (val x: Self) extends AnyVal {
      
      inline def setBoxes(value: Requireable[js.Object]): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Requireable[js.Object]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Requireable[js.Object]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLabels(value: Requireable[js.Object]): Self = StObject.set(x, "maxLabels", value.asInstanceOf[js.Any])
      
      inline def setMedian(value: Requireable[js.Object]): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMedianLabels(value: Requireable[js.Object]): Self = StObject.set(x, "medianLabels", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Requireable[js.Object]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinLabels(value: Requireable[js.Object]): Self = StObject.set(x, "minLabels", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Requireable[js.Object]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setQ1(value: Requireable[js.Object]): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
      
      inline def setQ1Labels(value: Requireable[js.Object]): Self = StObject.set(x, "q1Labels", value.asInstanceOf[js.Any])
      
      inline def setQ3(value: Requireable[js.Object]): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
      
      inline def setQ3Labels(value: Requireable[js.Object]): Self = StObject.set(x, "q3Labels", value.asInstanceOf[js.Any])
      
      inline def setWhiskers(value: Requireable[js.Object]): Self = StObject.set(x, "whiskers", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContainerComponent extends StObject {
    
    var containerComponent: Element
    
    var data: js.Array[Median]
    
    var dataComponent: Element
    
    var groupComponent: Element
    
    var maxComponent: Element
    
    var maxLabelComponent: Element
    
    var medianComponent: Element
    
    var medianLabelComponent: Element
    
    var minComponent: Element
    
    var minLabelComponent: Element
    
    var q1Component: Element
    
    var q1LabelComponent: Element
    
    var q3Component: Element
    
    var q3LabelComponent: Element
    
    var samples: Double
    
    var sortKey: String
    
    var sortOrder: String
    
    var standalone: Boolean
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
  }
  object ContainerComponent {
    
    inline def apply(
      containerComponent: Element,
      data: js.Array[Median],
      dataComponent: Element,
      groupComponent: Element,
      maxComponent: Element,
      maxLabelComponent: Element,
      medianComponent: Element,
      medianLabelComponent: Element,
      minComponent: Element,
      minLabelComponent: Element,
      q1Component: Element,
      q1LabelComponent: Element,
      q3Component: Element,
      q3LabelComponent: Element,
      samples: Double,
      sortKey: String,
      sortOrder: String,
      standalone: Boolean,
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
    ): ContainerComponent = {
      val __obj = js.Dynamic.literal(containerComponent = containerComponent.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataComponent = dataComponent.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], maxComponent = maxComponent.asInstanceOf[js.Any], maxLabelComponent = maxLabelComponent.asInstanceOf[js.Any], medianComponent = medianComponent.asInstanceOf[js.Any], medianLabelComponent = medianLabelComponent.asInstanceOf[js.Any], minComponent = minComponent.asInstanceOf[js.Any], minLabelComponent = minLabelComponent.asInstanceOf[js.Any], q1Component = q1Component.asInstanceOf[js.Any], q1LabelComponent = q1LabelComponent.asInstanceOf[js.Any], q3Component = q3Component.asInstanceOf[js.Any], q3LabelComponent = q3LabelComponent.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], sortKey = sortKey.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerComponent] (val x: Self) extends AnyVal {
      
      inline def setContainerComponent(value: Element): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Median]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataComponent(value: Element): Self = StObject.set(x, "dataComponent", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Median*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGroupComponent(value: Element): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setMaxComponent(value: Element): Self = StObject.set(x, "maxComponent", value.asInstanceOf[js.Any])
      
      inline def setMaxLabelComponent(value: Element): Self = StObject.set(x, "maxLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setMedianComponent(value: Element): Self = StObject.set(x, "medianComponent", value.asInstanceOf[js.Any])
      
      inline def setMedianLabelComponent(value: Element): Self = StObject.set(x, "medianLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setMinComponent(value: Element): Self = StObject.set(x, "minComponent", value.asInstanceOf[js.Any])
      
      inline def setMinLabelComponent(value: Element): Self = StObject.set(x, "minLabelComponent", value.asInstanceOf[js.Any])
      
      inline def setQ1Component(value: Element): Self = StObject.set(x, "q1Component", value.asInstanceOf[js.Any])
      
      inline def setQ1LabelComponent(value: Element): Self = StObject.set(x, "q1LabelComponent", value.asInstanceOf[js.Any])
      
      inline def setQ3Component(value: Element): Self = StObject.set(x, "q3Component", value.asInstanceOf[js.Any])
      
      inline def setQ3LabelComponent(value: Element): Self = StObject.set(x, "q3LabelComponent", value.asInstanceOf[js.Any])
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventHandlers extends StObject {
    
    var eventHandlers: Requireable[js.Object]
    
    var eventKey: Requireable[String | Double | js.Array[Any]]
    
    var target: Requireable[String]
  }
  object EventHandlers {
    
    inline def apply(
      eventHandlers: Requireable[js.Object],
      eventKey: Requireable[String | Double | js.Array[Any]],
      target: Requireable[String]
    ): EventHandlers = {
      val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventHandlers] (val x: Self) extends AnyVal {
      
      inline def setEventHandlers(value: Requireable[js.Object]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setEventKey(value: Requireable[String | Double | js.Array[Any]]): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Requireable[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
    var events: js.Array[Any]
    
    var getEventState: js.Function
  }
  object Events {
    
    inline def apply(events: js.Array[Any], getEventState: js.Function): Events = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getEventState = getEventState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: js.Array[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: Any*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setGetEventState(value: js.Function): Self = StObject.set(x, "getEventState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* props */ Any, 
          AddGlobalListener
        ] {
    
    var animationWhitelist: js.UndefOr[js.Array[String]] = js.native
    
    var expectedComponents: js.UndefOr[js.Array[String]] = js.native
    
    var getBaseProps: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* props */ Any, 
          Record[String, js.Object]
        ]
      ] = js.native
    
    var getChildren: js.UndefOr[
        js.Function3[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ /* props */ Any, 
          /* childComponents */ js.UndefOr[js.Array[ReactNode]], 
          /* calculatedProps */ js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any
          ], 
          Unit
        ]
      ] = js.native
    
    var role: js.UndefOr[String] = js.native
  }
  
  trait Max extends StObject {
    
    var max: Requireable[String]
    
    var median: Requireable[String]
    
    var min: Requireable[String]
    
    var q1: Requireable[String]
    
    var q3: Requireable[String]
  }
  object Max {
    
    inline def apply(
      max: Requireable[String],
      median: Requireable[String],
      min: Requireable[String],
      q1: Requireable[String],
      q3: Requireable[String]
    ): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Requireable[String]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMedian(value: Requireable[String]): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Requireable[String]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setQ1(value: Requireable[String]): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
      
      inline def setQ3(value: Requireable[String]): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    }
  }
  
  trait Median extends StObject {
    
    var max: Double
    
    var median: Double
    
    var min: Double
    
    var q1: Double
    
    var q3: Double
    
    var x: Double
  }
  object Median {
    
    inline def apply(max: Double, median: Double, min: Double, q1: Double, q3: Double, x: Double): Median = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[Median]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Median] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setQ1(value: Double): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
      
      inline def setQ3(value: Double): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofVictoryBoxPlotBase extends StObject {
    
    /* static member */
    var animationWhitelist: js.Array[
        boxWidth | datum | domain | domainPadding | events | eventKey | horizontal | labelOrientation | labels | max | maxComponent | maxLabelComponent | maxLabels | median | medianComponent | medianLabelComponent | medianLabels | min | minComponent | minLabelComponent | minLabels | q1 | q1Component | q1LabelComponent | q1Labels | q3 | q3Component | q3LabelComponent | q3Labels | style | text | whiskerWidth
      ]
    
    /* static member */
    var defaultProps: ContainerComponent
    
    /* static member */
    var defaultTransitions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any
    
    /* static member */
    var displayName: String
    
    /* static member */
    var expectedComponents: js.Array[
        boxWidth | datum | domain | domainPadding | events | eventKey | horizontal | labelOrientation | labels | max | maxComponent | maxLabelComponent | maxLabels | median | medianComponent | medianLabelComponent | medianLabels | min | minComponent | minLabelComponent | minLabels | q1 | q1Component | q1LabelComponent | q1Labels | q3 | q3Component | q3LabelComponent | q3Labels | style | text | whiskerWidth
      ]
    
    /* static member */
    var getBaseProps: js.Function1[/* props */ Any, Any]
    
    /* static member */
    var getData: js.Function1[/* props */ Any, Any]
    
    /* static member */
    var getDomain: js.Function2[/* props */ Any, /* axis */ Any, Any]
    
    /* static member */
    var propTypes: Animate
    
    /* static member */
    var role: String
  }
  object TypeofVictoryBoxPlotBase {
    
    inline def apply(
      animationWhitelist: js.Array[
          boxWidth | datum | domain | domainPadding | events | eventKey | horizontal | labelOrientation | labels | max | maxComponent | maxLabelComponent | maxLabels | median | medianComponent | medianLabelComponent | medianLabels | min | minComponent | minLabelComponent | minLabels | q1 | q1Component | q1LabelComponent | q1Labels | q3 | q3Component | q3LabelComponent | q3Labels | style | text | whiskerWidth
        ],
      defaultProps: ContainerComponent,
      defaultTransitions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any,
      displayName: String,
      expectedComponents: js.Array[
          boxWidth | datum | domain | domainPadding | events | eventKey | horizontal | labelOrientation | labels | max | maxComponent | maxLabelComponent | maxLabels | median | medianComponent | medianLabelComponent | medianLabels | min | minComponent | minLabelComponent | minLabels | q1 | q1Component | q1LabelComponent | q1Labels | q3 | q3Component | q3LabelComponent | q3Labels | style | text | whiskerWidth
        ],
      getBaseProps: /* props */ Any => Any,
      getData: /* props */ Any => Any,
      getDomain: (/* props */ Any, /* axis */ Any) => Any,
      propTypes: Animate,
      role: String
    ): TypeofVictoryBoxPlotBase = {
      val __obj = js.Dynamic.literal(animationWhitelist = animationWhitelist.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], defaultTransitions = defaultTransitions.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], expectedComponents = expectedComponents.asInstanceOf[js.Any], getBaseProps = js.Any.fromFunction1(getBaseProps), getData = js.Any.fromFunction1(getData), getDomain = js.Any.fromFunction2(getDomain), propTypes = propTypes.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofVictoryBoxPlotBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofVictoryBoxPlotBase] (val x: Self) extends AnyVal {
      
      inline def setAnimationWhitelist(
        value: js.Array[
              boxWidth | datum | domain | domainPadding | events | eventKey | horizontal | labelOrientation | labels | max | maxComponent | maxLabelComponent | maxLabels | median | medianComponent | medianLabelComponent | medianLabels | min | minComponent | minLabelComponent | minLabels | q1 | q1Component | q1LabelComponent | q1Labels | q3 | q3Component | q3LabelComponent | q3Labels | style | text | whiskerWidth
            ]
      ): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
      
      inline def setAnimationWhitelistVarargs(
        value: (boxWidth | datum | domain | domainPadding | events | eventKey | horizontal | labelOrientation | labels | max | maxComponent | maxLabelComponent | maxLabels | median | medianComponent | medianLabelComponent | medianLabels | min | minComponent | minLabelComponent | minLabels | q1 | q1Component | q1LabelComponent | q1Labels | q3 | q3Component | q3LabelComponent | q3Labels | style | text | whiskerWidth)*
      ): Self = StObject.set(x, "animationWhitelist", js.Array(value*))
      
      inline def setDefaultProps(value: ContainerComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any
      ): Self = StObject.set(x, "defaultTransitions", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setExpectedComponents(
        value: js.Array[
              boxWidth | datum | domain | domainPadding | events | eventKey | horizontal | labelOrientation | labels | max | maxComponent | maxLabelComponent | maxLabels | median | medianComponent | medianLabelComponent | medianLabels | min | minComponent | minLabelComponent | minLabels | q1 | q1Component | q1LabelComponent | q1Labels | q3 | q3Component | q3LabelComponent | q3Labels | style | text | whiskerWidth
            ]
      ): Self = StObject.set(x, "expectedComponents", value.asInstanceOf[js.Any])
      
      inline def setExpectedComponentsVarargs(
        value: (boxWidth | datum | domain | domainPadding | events | eventKey | horizontal | labelOrientation | labels | max | maxComponent | maxLabelComponent | maxLabels | median | medianComponent | medianLabelComponent | medianLabels | min | minComponent | minLabelComponent | minLabels | q1 | q1Component | q1LabelComponent | q1Labels | q3 | q3Component | q3LabelComponent | q3Labels | style | text | whiskerWidth)*
      ): Self = StObject.set(x, "expectedComponents", js.Array(value*))
      
      inline def setGetBaseProps(value: /* props */ Any => Any): Self = StObject.set(x, "getBaseProps", js.Any.fromFunction1(value))
      
      inline def setGetData(value: /* props */ Any => Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setGetDomain(value: (/* props */ Any, /* axis */ Any) => Any): Self = StObject.set(x, "getDomain", js.Any.fromFunction2(value))
      
      inline def setPropTypes(value: Animate): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object X {
    
    inline def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait XY extends StObject {
    
    var x: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Boolean] = js.undefined
  }
  object XY {
    
    inline def apply(): XY = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XY]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XY] (val x: Self) extends AnyVal {
      
      inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Y extends StObject {
    
    var x: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ] = js.undefined
    
    var y: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ] = js.undefined
  }
  object Y {
    
    inline def apply(): Y = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setX(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
