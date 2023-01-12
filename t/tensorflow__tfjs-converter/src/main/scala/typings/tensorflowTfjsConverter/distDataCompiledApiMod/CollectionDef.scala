package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollectionDef {
  
  /** Properties of an AnyList. */
  trait IAnyList extends StObject {
    
    /** AnyList value */
    var value: js.UndefOr[js.Array[IAny] | Null] = js.undefined
  }
  object IAnyList {
    
    inline def apply(): IAnyList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnyList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAnyList] (val x: Self) extends AnyVal {
      
      inline def setValue(value: js.Array[IAny]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: IAny*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /** Properties of a BytesList. */
  trait IBytesList extends StObject {
    
    /** BytesList value */
    var value: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
  }
  object IBytesList {
    
    inline def apply(): IBytesList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBytesList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBytesList] (val x: Self) extends AnyVal {
      
      inline def setValue(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /** Properties of a FloatList. */
  trait IFloatList extends StObject {
    
    /** FloatList value */
    var value: js.UndefOr[js.Array[Double] | Null] = js.undefined
  }
  object IFloatList {
    
    inline def apply(): IFloatList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFloatList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFloatList] (val x: Self) extends AnyVal {
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /** Properties of an Int64List. */
  trait IInt64List extends StObject {
    
    /** Int64List value */
    var value: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
  }
  object IInt64List {
    
    inline def apply(): IInt64List = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInt64List]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInt64List] (val x: Self) extends AnyVal {
      
      inline def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /** Properties of a NodeList. */
  trait INodeList extends StObject {
    
    /** NodeList value */
    var value: js.UndefOr[js.Array[String] | Null] = js.undefined
  }
  object INodeList {
    
    inline def apply(): INodeList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INodeList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INodeList] (val x: Self) extends AnyVal {
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
