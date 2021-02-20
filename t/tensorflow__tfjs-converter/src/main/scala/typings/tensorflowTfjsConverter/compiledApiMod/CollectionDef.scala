package typings.tensorflowTfjsConverter.compiledApiMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollectionDef {
  
  /** Properties of an AnyList. */
  @js.native
  trait IAnyList extends StObject {
    
    /** AnyList value */
    var value: js.UndefOr[js.Array[IAny] | Null] = js.native
  }
  object IAnyList {
    
    @scala.inline
    def apply(): IAnyList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnyList]
    }
    
    @scala.inline
    implicit class IAnyListMutableBuilder[Self <: IAnyList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[IAny]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: IAny*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /** Properties of a BytesList. */
  @js.native
  trait IBytesList extends StObject {
    
    /** BytesList value */
    var value: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
  }
  object IBytesList {
    
    @scala.inline
    def apply(): IBytesList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBytesList]
    }
    
    @scala.inline
    implicit class IBytesListMutableBuilder[Self <: IBytesList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[Uint8Array]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: Uint8Array*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /** Properties of a FloatList. */
  @js.native
  trait IFloatList extends StObject {
    
    /** FloatList value */
    var value: js.UndefOr[js.Array[Double] | Null] = js.native
  }
  object IFloatList {
    
    @scala.inline
    def apply(): IFloatList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFloatList]
    }
    
    @scala.inline
    implicit class IFloatListMutableBuilder[Self <: IFloatList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /** Properties of an Int64List. */
  @js.native
  trait IInt64List extends StObject {
    
    /** Int64List value */
    var value: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  }
  object IInt64List {
    
    @scala.inline
    def apply(): IInt64List = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInt64List]
    }
    
    @scala.inline
    implicit class IInt64ListMutableBuilder[Self <: IInt64List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /** Properties of a NodeList. */
  @js.native
  trait INodeList extends StObject {
    
    /** NodeList value */
    var value: js.UndefOr[js.Array[String] | Null] = js.native
  }
  object INodeList {
    
    @scala.inline
    def apply(): INodeList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INodeList]
    }
    
    @scala.inline
    implicit class INodeListMutableBuilder[Self <: INodeList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
