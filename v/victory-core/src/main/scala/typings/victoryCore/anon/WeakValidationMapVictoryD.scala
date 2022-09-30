package typings.victoryCore.anon

import typings.react.mod.ReactElement
import typings.react.mod.Validator
import typings.victoryCore.propTypesMod.CategoryPropType
import typings.victoryCore.propTypesMod.DataGetterPropType
import typings.victoryCore.propTypesMod.DomainPaddingPropType
import typings.victoryCore.propTypesMod.DomainPropType
import typings.victoryCore.propTypesMod.SortOrderPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<victory-core.victory-core/lib/victory-util/common-props.VictoryDatableProps> */
trait WeakValidationMapVictoryD extends StObject {
  
  var categories: js.UndefOr[Validator[js.UndefOr[CategoryPropType | Null]]] = js.undefined
  
  var data: js.UndefOr[Validator[js.UndefOr[js.Array[Any] | Null]]] = js.undefined
  
  var dataComponent: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var domain: js.UndefOr[Validator[js.UndefOr[DomainPropType | Null]]] = js.undefined
  
  var domainPadding: js.UndefOr[Validator[js.UndefOr[DomainPaddingPropType | Null]]] = js.undefined
  
  var samples: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var sortKey: js.UndefOr[Validator[js.UndefOr[DataGetterPropType | Null]]] = js.undefined
  
  var sortOrder: js.UndefOr[Validator[js.UndefOr[Null | SortOrderPropType]]] = js.undefined
  
  var x: js.UndefOr[Validator[js.UndefOr[DataGetterPropType | Null]]] = js.undefined
  
  var y: js.UndefOr[Validator[js.UndefOr[DataGetterPropType | Null]]] = js.undefined
  
  var y0: js.UndefOr[Validator[js.UndefOr[DataGetterPropType | Null]]] = js.undefined
}
object WeakValidationMapVictoryD {
  
  inline def apply(): WeakValidationMapVictoryD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapVictoryD]
  }
  
  extension [Self <: WeakValidationMapVictoryD](x: Self) {
    
    inline def setCategories(value: Validator[js.UndefOr[CategoryPropType | Null]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setData(value: Validator[js.UndefOr[js.Array[Any] | Null]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataComponent(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "dataComponent", value.asInstanceOf[js.Any])
    
    inline def setDataComponentUndefined: Self = StObject.set(x, "dataComponent", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDomain(value: Validator[js.UndefOr[DomainPropType | Null]]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainPadding(value: Validator[js.UndefOr[DomainPaddingPropType | Null]]): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setSamples(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setSortKey(value: Validator[js.UndefOr[DataGetterPropType | Null]]): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    
    inline def setSortOrder(value: Validator[js.UndefOr[Null | SortOrderPropType]]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setX(value: Validator[js.UndefOr[DataGetterPropType | Null]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Validator[js.UndefOr[DataGetterPropType | Null]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Validator[js.UndefOr[DataGetterPropType | Null]]): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
