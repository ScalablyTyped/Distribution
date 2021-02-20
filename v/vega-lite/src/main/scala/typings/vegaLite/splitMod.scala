package typings.vegaLite

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMod {
  
  @JSImport("vega-lite/build/src/compile/split", "Split")
  @js.native
  class Split[T /* <: js.Object */] () extends StObject {
    def this(explicit: Partial[T]) = this()
    def this(explicit: js.UndefOr[scala.Nothing], `implicit`: Partial[T]) = this()
    def this(explicit: Partial[T], `implicit`: Partial[T]) = this()
    
    def combine(): Partial[T] = js.native
    
    /**
      * Merge split object into this split object. Properties from the other split
      * overwrite properties from this split.
      */
    def copyAll(other: Split[T]): Unit = js.native
    
    def copyKeyFromObject[S /* <: T */](key: /* keyof T */ String, s: Partial[S]): Unit = js.native
    
    def copyKeyFromSplit[S /* <: T */](key: /* keyof T */ String, s: Split[S]): Unit = js.native
    
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
      value: Explicit[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): Unit = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/split", "defaultTieBreaker")
  @js.native
  def defaultTieBreaker[S, T](v1: Explicit[T], v2: Explicit[T], property: /* keyof S */ String, propertyOf: SplitParentProperty): Explicit[T] = js.native
  
  @JSImport("vega-lite/build/src/compile/split", "makeExplicit")
  @js.native
  def makeExplicit[T](value: T): Explicit[T] = js.native
  
  @JSImport("vega-lite/build/src/compile/split", "makeImplicit")
  @js.native
  def makeImplicit[T](value: T): Explicit[T] = js.native
  
  @JSImport("vega-lite/build/src/compile/split", "mergeValuesWithExplicit")
  @js.native
  def mergeValuesWithExplicit[S, T](v1: Explicit[T], v2: Explicit[T], property: /* keyof S */ String, propertyOf: SplitParentProperty): Explicit[T] = js.native
  @JSImport("vega-lite/build/src/compile/split", "mergeValuesWithExplicit")
  @js.native
  def mergeValuesWithExplicit[S, T](
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
  ): Explicit[T] = js.native
  
  @JSImport("vega-lite/build/src/compile/split", "tieBreakByComparing")
  @js.native
  def tieBreakByComparing[S, T](compare: js.Function2[/* v1 */ T, /* v2 */ T, Double]): js.Function4[
    /* v1 */ Explicit[T], 
    /* v2 */ Explicit[T], 
    /* property */ (/* keyof S */ String) | scala.Nothing, 
    /* propertyOf */ SplitParentProperty, 
    Explicit[T]
  ] = js.native
  
  @js.native
  trait Explicit[T] extends StObject {
    
    var explicit: Boolean = js.native
    
    var value: T = js.native
  }
  object Explicit {
    
    @scala.inline
    def apply[T](explicit: Boolean, value: T): Explicit[T] = {
      val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Explicit[T]]
    }
    
    @scala.inline
    implicit class ExplicitMutableBuilder[Self <: Explicit[_], T] (val x: Self with Explicit[T]) extends AnyVal {
      
      @scala.inline
      def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def _empty: typings.vegaLite.vegaLiteStrings._empty = "".asInstanceOf[typings.vegaLite.vegaLiteStrings._empty]
    
    @scala.inline
    def axis: typings.vegaLite.vegaLiteStrings.axis = "axis".asInstanceOf[typings.vegaLite.vegaLiteStrings.axis]
    
    @scala.inline
    def legend: typings.vegaLite.vegaLiteStrings.legend = "legend".asInstanceOf[typings.vegaLite.vegaLiteStrings.legend]
    
    @scala.inline
    def scale: typings.vegaLite.vegaLiteStrings.scale = "scale".asInstanceOf[typings.vegaLite.vegaLiteStrings.scale]
  }
}
