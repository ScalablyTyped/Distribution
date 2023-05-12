package typings.typescriptMemoize

import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015MemoizeDecoratorMod {
  
  @JSImport("typescript-memoize/dist/es2015/memoize-decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Memoize(): js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Memoize")().asInstanceOf[js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ]]
  inline def Memoize(args: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Any])]): js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Memoize")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ]]
  inline def Memoize(args: MemoizeArgs): js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Memoize")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ]]
  
  inline def MemoizeExpiring(expiring: Double): js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoizeExpiring")(expiring.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ]]
  inline def MemoizeExpiring(expiring: Double, hashFunction: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Any])]): js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("MemoizeExpiring")(expiring.asInstanceOf[js.Any], hashFunction.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    Unit
  ]]
  
  inline def clear(tags: js.Array[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(tags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait MemoizeArgs extends StObject {
    
    var expiring: js.UndefOr[Double] = js.undefined
    
    var hashFunction: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MemoizeArgs {
    
    inline def apply(): MemoizeArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoizeArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoizeArgs] (val x: Self) extends AnyVal {
      
      inline def setExpiring(value: Double): Self = StObject.set(x, "expiring", value.asInstanceOf[js.Any])
      
      inline def setExpiringUndefined: Self = StObject.set(x, "expiring", js.undefined)
      
      inline def setHashFunction(value: Boolean | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
      
      inline def setHashFunctionFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "hashFunction", js.Any.fromFunction1(value))
      
      inline def setHashFunctionUndefined: Self = StObject.set(x, "hashFunction", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
