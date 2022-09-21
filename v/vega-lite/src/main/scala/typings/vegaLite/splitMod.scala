package typings.vegaLite

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMod {
  
  @JSImport("vega-lite/build/src/compile/split", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/split", "Split")
  @js.native
  open class Split[T /* <: js.Object */] () extends StObject {
    def this(explicit: Partial[T]) = this()
    def this(explicit: Unit, `implicit`: Partial[T]) = this()
    def this(explicit: Partial[T], `implicit`: Partial[T]) = this()
    
    def combine(): Partial[T] = js.native
    
    /**
      * Merge split object into this split object. Properties from the other split
      * overwrite properties from this split.
      */
    def copyAll(other: Split[T]): Unit = js.native
    
    def copyKeyFromObject[S /* <: T */](key: /* keyof T */ String, s: Partial[S]): Unit = js.native
    
    def copyKeyFromSplit[S /* <: T */](key: /* keyof T */ String, hasExplicitImplicit: Split[S]): Unit = js.native
    
    val explicit: Partial[T] = js.native
    
    def get[K /* <: /* keyof T */ String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
    
    def getWithExplicit[K /* <: /* keyof T */ String */](key: K): Explicit[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ] = js.native
    
    val `implicit`: Partial[T] = js.native
    
    def set[K /* <: /* keyof T */ String */](
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
      explicit: Boolean
    ): this.type = js.native
    
    def setWithExplicit[K /* <: /* keyof T */ String */](
      key: K,
      hasValueExplicit: Explicit[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): Unit = js.native
  }
  
  inline def defaultTieBreaker[S, T](v1: Explicit[T], v2: Explicit[T], property: /* keyof S */ String, propertyOf: SplitParentProperty): Explicit[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTieBreaker")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], property.asInstanceOf[js.Any], propertyOf.asInstanceOf[js.Any])).asInstanceOf[Explicit[T]]
  
  inline def makeExplicit[T](value: T): Explicit[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeExplicit")(value.asInstanceOf[js.Any]).asInstanceOf[Explicit[T]]
  
  inline def makeImplicit[T](value: T): Explicit[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeImplicit")(value.asInstanceOf[js.Any]).asInstanceOf[Explicit[T]]
  
  inline def mergeValuesWithExplicit[S, T](v1: Explicit[T], v2: Explicit[T], property: /* keyof S */ String, propertyOf: SplitParentProperty): Explicit[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeValuesWithExplicit")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], property.asInstanceOf[js.Any], propertyOf.asInstanceOf[js.Any])).asInstanceOf[Explicit[T]]
  inline def mergeValuesWithExplicit[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: /* keyof S */ String,
    propertyOf: SplitParentProperty,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* keyof S */ /* property */ String, 
      /* propertyOf */ String, 
      Explicit[T]
    ]
  ): Explicit[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeValuesWithExplicit")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], property.asInstanceOf[js.Any], propertyOf.asInstanceOf[js.Any], tieBreaker.asInstanceOf[js.Any])).asInstanceOf[Explicit[T]]
  
  inline def tieBreakByComparing[S, T](compare: js.Function2[/* v1 */ T, /* v2 */ T, Double]): js.Function4[
    /* v1 */ Explicit[T], 
    /* v2 */ Explicit[T], 
    /* property */ (/* keyof S */ String) | scala.Nothing, 
    /* propertyOf */ SplitParentProperty, 
    Explicit[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tieBreakByComparing")(compare.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* v1 */ Explicit[T], 
    /* v2 */ Explicit[T], 
    /* property */ (/* keyof S */ String) | scala.Nothing, 
    /* propertyOf */ SplitParentProperty, 
    Explicit[T]
  ]]
  
  trait Explicit[T] extends StObject {
    
    var explicit: Boolean
    
    var value: T
  }
  object Explicit {
    
    inline def apply[T](explicit: Boolean, value: T): Explicit[T] = {
      val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Explicit[T]]
    }
    
    extension [Self <: Explicit[?], T](x: Self & Explicit[T]) {
      
      inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.scale
    - typings.vegaLite.vegaLiteStrings.axis
    - typings.vegaLite.vegaLiteStrings.legend
    - typings.vegaLite.vegaLiteStrings._empty
  */
  trait SplitParentProperty extends StObject
  object SplitParentProperty {
    
    inline def _empty: typings.vegaLite.vegaLiteStrings._empty = "".asInstanceOf[typings.vegaLite.vegaLiteStrings._empty]
    
    inline def axis: typings.vegaLite.vegaLiteStrings.axis = "axis".asInstanceOf[typings.vegaLite.vegaLiteStrings.axis]
    
    inline def legend: typings.vegaLite.vegaLiteStrings.legend = "legend".asInstanceOf[typings.vegaLite.vegaLiteStrings.legend]
    
    inline def scale: typings.vegaLite.vegaLiteStrings.scale = "scale".asInstanceOf[typings.vegaLite.vegaLiteStrings.scale]
  }
}
