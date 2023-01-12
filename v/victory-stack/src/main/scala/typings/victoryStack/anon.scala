package typings.victoryStack

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.react.mod.ReactElement
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.victoryStack.libVictoryStackMod.VictoryStackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var x: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ] = js.undefined
    
    var y: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
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
  
  trait `1` extends StObject {
    
    var x: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Boolean] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Animate extends StObject {
    
    var animate: js.UndefOr[
        Validator[
          js.UndefOr[
            Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var bins: Requireable[Double | (js.Array[js.UndefOr[Double | js.Date | Null]])]
    
    var categories: Requireable[(js.Array[js.UndefOr[String | Null]]) | InferProps[Y]]
    
    var children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]
    
    var colorScale: Requireable[String | (js.Array[js.UndefOr[String | Null]])]
    
    var containerComponent: js.UndefOr[Validator[js.UndefOr[ReactElement | Null]]] = js.undefined
    
    var domainPadding: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.PaddingType> */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var externalEventMutations: js.UndefOr[
        Validator[
          js.UndefOr[
            (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
            ]) | Null
          ]
        ]
      ] = js.undefined
    
    var fillInMissingData: Requireable[Boolean]
    
    var groupComponent: js.UndefOr[Validator[js.UndefOr[ReactElement | Null]]] = js.undefined
    
    var height: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
    
    var horizontal: Requireable[Boolean]
    
    var labelComponent: Requireable[ReactElementLike]
    
    var labels: Requireable[js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]
    
    var maxDomain: js.UndefOr[Validator[js.UndefOr[Double | XY | Null]]] = js.undefined
    
    var minDomain: js.UndefOr[Validator[js.UndefOr[Double | XY | Null]]] = js.undefined
    
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
    
    var scale: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | `0` | Null
          ]
        ]
      ] = js.undefined
    
    var sharedEvents: js.UndefOr[Validator[js.UndefOr[Events | Null]]] = js.undefined
    
    var singleQuadrantDomainPadding: js.UndefOr[Validator[js.UndefOr[Boolean | `1` | Null]]] = js.undefined
    
    var standalone: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
    
    var style: Requireable[InferProps[Data]]
    
    var theme: js.UndefOr[
        Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any) | Null
          ]
        ]
      ] = js.undefined
    
    var width: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
    
    var xOffset: Requireable[Double]
  }
  object Animate {
    
    inline def apply(
      bins: Requireable[Double | (js.Array[js.UndefOr[Double | js.Date | Null]])],
      categories: Requireable[(js.Array[js.UndefOr[String | Null]]) | InferProps[Y]],
      children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray],
      colorScale: Requireable[String | (js.Array[js.UndefOr[String | Null]])],
      fillInMissingData: Requireable[Boolean],
      horizontal: Requireable[Boolean],
      labelComponent: Requireable[ReactElementLike],
      labels: Requireable[js.Array[Any] | (js.Function1[/* repeated */ Any, Any])],
      style: Requireable[InferProps[Data]],
      xOffset: Requireable[Double]
    ): Animate = {
      val __obj = js.Dynamic.literal(bins = bins.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], colorScale = colorScale.asInstanceOf[js.Any], fillInMissingData = fillInMissingData.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], labelComponent = labelComponent.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any])
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
      
      inline def setBins(value: Requireable[Double | (js.Array[js.UndefOr[Double | js.Date | Null]])]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: Requireable[(js.Array[js.UndefOr[String | Null]]) | InferProps[Y]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setColorScale(value: Requireable[String | (js.Array[js.UndefOr[String | Null]])]): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
      
      inline def setContainerComponent(value: Validator[js.UndefOr[ReactElement | Null]]): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
      
      inline def setContainerComponentUndefined: Self = StObject.set(x, "containerComponent", js.undefined)
      
      inline def setDomainPadding(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.PaddingType> */ Any) | Null
              ]
            ]
      ): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
      
      inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
      
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
      
      inline def setFillInMissingData(value: Requireable[Boolean]): Self = StObject.set(x, "fillInMissingData", value.asInstanceOf[js.Any])
      
      inline def setGroupComponent(value: Validator[js.UndefOr[ReactElement | Null]]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontal(value: Requireable[Boolean]): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setLabelComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "labelComponent", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Requireable[js.Array[Any] | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setMaxDomain(value: Validator[js.UndefOr[Double | XY | Null]]): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
      
      inline def setMaxDomainUndefined: Self = StObject.set(x, "maxDomain", js.undefined)
      
      inline def setMinDomain(value: Validator[js.UndefOr[Double | XY | Null]]): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
      
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
      
      inline def setScale(
        value: Validator[
              js.UndefOr[
                (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | `0` | Null
              ]
            ]
      ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSharedEvents(value: Validator[js.UndefOr[Events | Null]]): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
      
      inline def setSharedEventsUndefined: Self = StObject.set(x, "sharedEvents", js.undefined)
      
      inline def setSingleQuadrantDomainPadding(value: Validator[js.UndefOr[Boolean | `1` | Null]]): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
      
      inline def setSingleQuadrantDomainPaddingUndefined: Self = StObject.set(x, "singleQuadrantDomainPadding", js.undefined)
      
      inline def setStandalone(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setStyle(value: Requireable[InferProps[Data]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
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
      
      inline def setXOffset(value: Requireable[Double]): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Any
    
    var left: Any
    
    var right: Any
    
    var top: Any
  }
  object Bottom {
    
    inline def apply(bottom: Any, left: Any, right: Any, top: Any): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Any): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(initialProps: VictoryStackProps): Element = js.native
    
    var defaultProps: ContainerComponent = js.native
    
    var propTypes: Animate = js.native
  }
  
  trait Categories extends StObject {
    
    var categories: Any
    
    var colorScale: Any
    
    var datasets: Any
    
    var domain: X
    
    var horizontal: Any
    
    var range: Any
    
    var role: String
    
    var scale: X
    
    var style: Any
  }
  object Categories {
    
    inline def apply(
      categories: Any,
      colorScale: Any,
      datasets: Any,
      domain: X,
      horizontal: Any,
      range: Any,
      role: String,
      scale: X,
      style: Any
    ): Categories = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], colorScale = colorScale.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Categories]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Categories] (val x: Self) extends AnyVal {
      
      inline def setCategories(value: Any): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setColorScale(value: Any): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
      
      inline def setDatasets(value: Any): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: X): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Any): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setScale(value: X): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContainerComponent extends StObject {
    
    var containerComponent: Element
    
    var fillInMissingData: Boolean
    
    var groupComponent: Element
    
    var standalone: Boolean
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
  }
  object ContainerComponent {
    
    inline def apply(
      containerComponent: Element,
      fillInMissingData: Boolean,
      groupComponent: Element,
      standalone: Boolean,
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
    ): ContainerComponent = {
      val __obj = js.Dynamic.literal(containerComponent = containerComponent.asInstanceOf[js.Any], fillInMissingData = fillInMissingData.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerComponent] (val x: Self) extends AnyVal {
      
      inline def setContainerComponent(value: Element): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
      
      inline def setFillInMissingData(value: Boolean): Self = StObject.set(x, "fillInMissingData", value.asInstanceOf[js.Any])
      
      inline def setGroupComponent(value: Element): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: Requireable[js.Object]
    
    var labels: Requireable[js.Object]
    
    var parent: Requireable[js.Object]
  }
  object Data {
    
    inline def apply(data: Requireable[js.Object], labels: Requireable[js.Object], parent: Requireable[js.Object]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: Requireable[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Requireable[js.Object]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Requireable[js.Object]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Domain extends StObject {
    
    var categories: Any
    
    var domain: Any
    
    var height: Any
    
    var horizontal: Any
    
    var padding: Bottom
    
    var range: Any
    
    var scale: Any
    
    var standalone: Boolean
    
    var theme: Any
    
    var width: Any
  }
  object Domain {
    
    inline def apply(
      categories: Any,
      domain: Any,
      height: Any,
      horizontal: Any,
      padding: Bottom,
      range: Any,
      scale: Any,
      standalone: Boolean,
      theme: Any,
      width: Any
    ): Domain = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      inline def setCategories(value: Any): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: Any): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Any): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
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
  
  trait Type extends StObject {
    
    val `type`: Call
  }
  object Type {
    
    inline def apply(`type`: Call): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: Call): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
    
    var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
  }
  object X {
    
    inline def apply(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any,
      y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
    ): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait XY extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object XY {
    
    inline def apply(): XY = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XY]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XY] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Y extends StObject {
    
    var x: Requireable[js.Array[js.UndefOr[String | Null]]]
    
    var y: Requireable[js.Array[js.UndefOr[String | Null]]]
  }
  object Y {
    
    inline def apply(
      x: Requireable[js.Array[js.UndefOr[String | Null]]],
      y: Requireable[js.Array[js.UndefOr[String | Null]]]
    ): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setX(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
