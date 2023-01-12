package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpDef {
  
  /** Properties of an ArgDef. */
  trait IArgDef extends StObject {
    
    /** ArgDef description */
    var description: js.UndefOr[String | Null] = js.undefined
    
    /** ArgDef isRef */
    var isRef: js.UndefOr[Boolean | Null] = js.undefined
    
    /** ArgDef name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** ArgDef numberAttr */
    var numberAttr: js.UndefOr[String | Null] = js.undefined
    
    /** ArgDef type */
    var `type`: js.UndefOr[DataType | Null] = js.undefined
    
    /** ArgDef typeAttr */
    var typeAttr: js.UndefOr[String | Null] = js.undefined
    
    /** ArgDef typeListAttr */
    var typeListAttr: js.UndefOr[String | Null] = js.undefined
  }
  object IArgDef {
    
    inline def apply(): IArgDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IArgDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IArgDef] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIsRef(value: Boolean): Self = StObject.set(x, "isRef", value.asInstanceOf[js.Any])
      
      inline def setIsRefNull: Self = StObject.set(x, "isRef", null)
      
      inline def setIsRefUndefined: Self = StObject.set(x, "isRef", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNumberAttr(value: String): Self = StObject.set(x, "numberAttr", value.asInstanceOf[js.Any])
      
      inline def setNumberAttrNull: Self = StObject.set(x, "numberAttr", null)
      
      inline def setNumberAttrUndefined: Self = StObject.set(x, "numberAttr", js.undefined)
      
      inline def setType(value: DataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeAttr(value: String): Self = StObject.set(x, "typeAttr", value.asInstanceOf[js.Any])
      
      inline def setTypeAttrNull: Self = StObject.set(x, "typeAttr", null)
      
      inline def setTypeAttrUndefined: Self = StObject.set(x, "typeAttr", js.undefined)
      
      inline def setTypeListAttr(value: String): Self = StObject.set(x, "typeListAttr", value.asInstanceOf[js.Any])
      
      inline def setTypeListAttrNull: Self = StObject.set(x, "typeListAttr", null)
      
      inline def setTypeListAttrUndefined: Self = StObject.set(x, "typeListAttr", js.undefined)
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of an AttrDef. */
  trait IAttrDef extends StObject {
    
    /** AttrDef allowedValues */
    var allowedValues: js.UndefOr[IAttrValue | Null] = js.undefined
    
    /** AttrDef defaultValue */
    var defaultValue: js.UndefOr[IAttrValue | Null] = js.undefined
    
    /** AttrDef description */
    var description: js.UndefOr[String | Null] = js.undefined
    
    /** AttrDef hasMinimum */
    var hasMinimum: js.UndefOr[Boolean | Null] = js.undefined
    
    /** AttrDef minimum */
    var minimum: js.UndefOr[Double | String | Null] = js.undefined
    
    /** AttrDef name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** AttrDef type */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object IAttrDef {
    
    inline def apply(): IAttrDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAttrDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAttrDef] (val x: Self) extends AnyVal {
      
      inline def setAllowedValues(value: IAttrValue): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
      
      inline def setAllowedValuesNull: Self = StObject.set(x, "allowedValues", null)
      
      inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
      
      inline def setDefaultValue(value: IAttrValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHasMinimum(value: Boolean): Self = StObject.set(x, "hasMinimum", value.asInstanceOf[js.Any])
      
      inline def setHasMinimumNull: Self = StObject.set(x, "hasMinimum", null)
      
      inline def setHasMinimumUndefined: Self = StObject.set(x, "hasMinimum", js.undefined)
      
      inline def setMinimum(value: Double | String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumNull: Self = StObject.set(x, "minimum", null)
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of an OpDeprecation. */
  trait IOpDeprecation extends StObject {
    
    /** OpDeprecation explanation */
    var explanation: js.UndefOr[String | Null] = js.undefined
    
    /** OpDeprecation version */
    var version: js.UndefOr[Double | Null] = js.undefined
  }
  object IOpDeprecation {
    
    inline def apply(): IOpDeprecation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOpDeprecation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOpDeprecation] (val x: Self) extends AnyVal {
      
      inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
      
      inline def setExplanationNull: Self = StObject.set(x, "explanation", null)
      
      inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
