package typings.victoryErrorbar

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
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
    
    var borderWidth: Requireable[Double]
    
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
    
    var errorX: Requireable[
        String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
      ]
    
    var errorY: Requireable[
        String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
      ]
    
    var externalEventMutations: js.UndefOr[
        Validator[
          js.UndefOr[
            (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, StringOrNumberOrList> */ Any
            ]) | Null
          ]
        ]
      ] = js.undefined
    
    var groupComponent: js.UndefOr[Validator[js.UndefOr[ReactElement | Null]]] = js.undefined
    
    var height: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
    
    var horizontal: Requireable[Boolean]
    
    var maxDomain: js.UndefOr[Validator[js.UndefOr[Double | X | Null]]] = js.undefined
    
    var minDomain: js.UndefOr[Validator[js.UndefOr[Double | X | Null]]] = js.undefined
    
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
    
    var theme: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any) | Null
          ]
        ]
      ] = js.undefined
    
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
      borderWidth: Requireable[Double],
      errorX: Requireable[
          String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
        ],
      errorY: Requireable[
          String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
        ],
      horizontal: Requireable[Boolean]
    ): Animate = {
      val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], errorX = errorX.asInstanceOf[js.Any], errorY = errorY.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any])
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
      
      inline def setBorderWidth(value: Requireable[Double]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
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
      
      inline def setErrorX(
        value: Requireable[
              String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
            ]
      ): Self = StObject.set(x, "errorX", value.asInstanceOf[js.Any])
      
      inline def setErrorY(
        value: Requireable[
              String | Double | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]])
            ]
      ): Self = StObject.set(x, "errorY", value.asInstanceOf[js.Any])
      
      inline def setExternalEventMutations(
        value: Validator[
              js.UndefOr[
                (js.Array[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, StringOrNumberOrList> */ Any
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
      
      inline def setMaxDomain(value: Validator[js.UndefOr[Double | X | Null]]): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
      
      inline def setMaxDomainUndefined: Self = StObject.set(x, "maxDomain", js.undefined)
      
      inline def setMinDomain(value: Validator[js.UndefOr[Double | X | Null]]): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
      
      inline def setMinDomainUndefined: Self = StObject.set(x, "minDomain", js.undefined)
      
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
      
      inline def setTheme(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
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
  
  trait ContainerComponent extends StObject {
    
    var containerComponent: Element
    
    var data: js.Array[ErrorX]
    
    var dataComponent: Element
    
    var groupComponent: Element
    
    var labelComponent: Element
    
    var samples: Double
    
    var sortOrder: String
    
    var standalone: Boolean
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
  }
  object ContainerComponent {
    
    inline def apply(
      containerComponent: Element,
      data: js.Array[ErrorX],
      dataComponent: Element,
      groupComponent: Element,
      labelComponent: Element,
      samples: Double,
      sortOrder: String,
      standalone: Boolean,
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
    ): ContainerComponent = {
      val __obj = js.Dynamic.literal(containerComponent = containerComponent.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataComponent = dataComponent.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], labelComponent = labelComponent.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerComponent] (val x: Self) extends AnyVal {
      
      inline def setContainerComponent(value: Element): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[ErrorX]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataComponent(value: Element): Self = StObject.set(x, "dataComponent", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: ErrorX*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGroupComponent(value: Element): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setLabelComponent(value: Element): Self = StObject.set(x, "labelComponent", value.asInstanceOf[js.Any])
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: Any
    
    var errorIndex: Double
  }
  object Error {
    
    inline def apply(error: Any, errorIndex: Double): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorIndex = errorIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorIndex(value: Double): Self = StObject.set(x, "errorIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorX extends StObject {
    
    var errorX: Double
    
    var errorY: Double
    
    var x: Double
    
    var y: Double
  }
  object ErrorX {
    
    inline def apply(errorX: Double, errorY: Double, x: Double, y: Double): ErrorX = {
      val __obj = js.Dynamic.literal(errorX = errorX.asInstanceOf[js.Any], errorY = errorY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorX] (val x: Self) extends AnyVal {
      
      inline def setErrorX(value: Double): Self = StObject.set(x, "errorX", value.asInstanceOf[js.Any])
      
      inline def setErrorY(value: Double): Self = StObject.set(x, "errorY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
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
  
  trait TypeofVictoryErrorBarBase extends StObject {
    
    /* static member */
    var animationWhitelist: js.Array[String]
    
    /* static member */
    var defaultProps: ContainerComponent
    
    /* static member */
    var defaultTransitions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any
    
    /* static member */
    var displayName: String
    
    /* static member */
    var expectedComponents: js.Array[String]
    
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
  object TypeofVictoryErrorBarBase {
    
    inline def apply(
      animationWhitelist: js.Array[String],
      defaultProps: ContainerComponent,
      defaultTransitions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any,
      displayName: String,
      expectedComponents: js.Array[String],
      getBaseProps: /* props */ Any => Any,
      getData: /* props */ Any => Any,
      getDomain: (/* props */ Any, /* axis */ Any) => Any,
      propTypes: Animate,
      role: String
    ): TypeofVictoryErrorBarBase = {
      val __obj = js.Dynamic.literal(animationWhitelist = animationWhitelist.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], defaultTransitions = defaultTransitions.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], expectedComponents = expectedComponents.asInstanceOf[js.Any], getBaseProps = js.Any.fromFunction1(getBaseProps), getData = js.Any.fromFunction1(getData), getDomain = js.Any.fromFunction2(getDomain), propTypes = propTypes.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofVictoryErrorBarBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofVictoryErrorBarBase] (val x: Self) extends AnyVal {
      
      inline def setAnimationWhitelist(value: js.Array[String]): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
      
      inline def setAnimationWhitelistVarargs(value: String*): Self = StObject.set(x, "animationWhitelist", js.Array(value*))
      
      inline def setDefaultProps(value: ContainerComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any
      ): Self = StObject.set(x, "defaultTransitions", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setExpectedComponents(value: js.Array[String]): Self = StObject.set(x, "expectedComponents", value.asInstanceOf[js.Any])
      
      inline def setExpectedComponentsVarargs(value: String*): Self = StObject.set(x, "expectedComponents", js.Array(value*))
      
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
