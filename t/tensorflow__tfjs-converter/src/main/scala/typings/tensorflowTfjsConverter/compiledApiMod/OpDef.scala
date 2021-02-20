package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpDef {
  
  /** Properties of an ArgDef. */
  @js.native
  trait IArgDef extends StObject {
    
    /** ArgDef description */
    var description: js.UndefOr[String | Null] = js.native
    
    /** ArgDef isRef */
    var isRef: js.UndefOr[Boolean | Null] = js.native
    
    /** ArgDef name */
    var name: js.UndefOr[String | Null] = js.native
    
    /** ArgDef numberAttr */
    var numberAttr: js.UndefOr[String | Null] = js.native
    
    /** ArgDef type */
    var `type`: js.UndefOr[DataType | Null] = js.native
    
    /** ArgDef typeAttr */
    var typeAttr: js.UndefOr[String | Null] = js.native
    
    /** ArgDef typeListAttr */
    var typeListAttr: js.UndefOr[String | Null] = js.native
  }
  object IArgDef {
    
    @scala.inline
    def apply(): IArgDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IArgDef]
    }
    
    @scala.inline
    implicit class IArgDefMutableBuilder[Self <: IArgDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIsRef(value: Boolean): Self = StObject.set(x, "isRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRefNull: Self = StObject.set(x, "isRef", null)
      
      @scala.inline
      def setIsRefUndefined: Self = StObject.set(x, "isRef", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumberAttr(value: String): Self = StObject.set(x, "numberAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberAttrNull: Self = StObject.set(x, "numberAttr", null)
      
      @scala.inline
      def setNumberAttrUndefined: Self = StObject.set(x, "numberAttr", js.undefined)
      
      @scala.inline
      def setType(value: DataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeAttr(value: String): Self = StObject.set(x, "typeAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeAttrNull: Self = StObject.set(x, "typeAttr", null)
      
      @scala.inline
      def setTypeAttrUndefined: Self = StObject.set(x, "typeAttr", js.undefined)
      
      @scala.inline
      def setTypeListAttr(value: String): Self = StObject.set(x, "typeListAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeListAttrNull: Self = StObject.set(x, "typeListAttr", null)
      
      @scala.inline
      def setTypeListAttrUndefined: Self = StObject.set(x, "typeListAttr", js.undefined)
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of an AttrDef. */
  @js.native
  trait IAttrDef extends StObject {
    
    /** AttrDef allowedValues */
    var allowedValues: js.UndefOr[IAttrValue | Null] = js.native
    
    /** AttrDef defaultValue */
    var defaultValue: js.UndefOr[IAttrValue | Null] = js.native
    
    /** AttrDef description */
    var description: js.UndefOr[String | Null] = js.native
    
    /** AttrDef hasMinimum */
    var hasMinimum: js.UndefOr[Boolean | Null] = js.native
    
    /** AttrDef minimum */
    var minimum: js.UndefOr[Double | String | Null] = js.native
    
    /** AttrDef name */
    var name: js.UndefOr[String | Null] = js.native
    
    /** AttrDef type */
    var `type`: js.UndefOr[String | Null] = js.native
  }
  object IAttrDef {
    
    @scala.inline
    def apply(): IAttrDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAttrDef]
    }
    
    @scala.inline
    implicit class IAttrDefMutableBuilder[Self <: IAttrDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedValues(value: IAttrValue): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedValuesNull: Self = StObject.set(x, "allowedValues", null)
      
      @scala.inline
      def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: IAttrValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHasMinimum(value: Boolean): Self = StObject.set(x, "hasMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMinimumNull: Self = StObject.set(x, "hasMinimum", null)
      
      @scala.inline
      def setHasMinimumUndefined: Self = StObject.set(x, "hasMinimum", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double | String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumNull: Self = StObject.set(x, "minimum", null)
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** Properties of an OpDeprecation. */
  @js.native
  trait IOpDeprecation extends StObject {
    
    /** OpDeprecation explanation */
    var explanation: js.UndefOr[String | Null] = js.native
    
    /** OpDeprecation version */
    var version: js.UndefOr[Double | Null] = js.native
  }
  object IOpDeprecation {
    
    @scala.inline
    def apply(): IOpDeprecation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOpDeprecation]
    }
    
    @scala.inline
    implicit class IOpDeprecationMutableBuilder[Self <: IOpDeprecation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplanationNull: Self = StObject.set(x, "explanation", null)
      
      @scala.inline
      def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionNull: Self = StObject.set(x, "version", null)
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
