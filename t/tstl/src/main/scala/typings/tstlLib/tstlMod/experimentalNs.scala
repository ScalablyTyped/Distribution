package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "experimental")
@js.native
object experimentalNs extends js.Object {
  @js.native
  class Barrier protected ()
    extends tstlLib.experimentalMod.Barrier {
    def this(size: scala.Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatMap[Key, T] ()
    extends tstlLib.experimentalMod.FlatMap[Key, T] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: tstlLib.experimentalContainerFlatMapMod.FlatMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ]) = this()
    def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatMultiMap[Key, T] ()
    extends tstlLib.experimentalMod.FlatMultiMap[Key, T] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: tstlLib.experimentalContainerFlatMultiMapMod.FlatMultiMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ]) = this()
    def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatMultiSet[Key] ()
    extends tstlLib.experimentalMod.FlatMultiSet[Key] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: tstlLib.experimentalContainerFlatMultiSetMod.FlatMultiSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]) = this()
    def this(items: js.Array[Key], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatSet[Key] ()
    extends tstlLib.experimentalMod.FlatSet[Key] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: tstlLib.experimentalContainerFlatSetMod.FlatSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]) = this()
    def this(items: js.Array[Key], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  }
  
  @js.native
  class FlexBarrier protected ()
    extends tstlLib.experimentalMod.FlexBarrier {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      * @param complete Complete function re-configuring *size* when downward count be zero. Default is a function always returning -1, which means the barrier is not reusable more.
      */
    def this(size: scala.Double) = this()
    def this(size: scala.Double, complete: js.Function0[scala.Double]) = this()
  }
  
  @js.native
  class Latch protected ()
    extends tstlLib.experimentalMod.Latch {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      */
    def this(size: scala.Double) = this()
  }
  
  @js.native
  class Semaphore[Max /* <: scala.Double */] protected ()
    extends tstlLib.experimentalMod.Semaphore[Max] {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections lockable.
      */
    def this(max: Max) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class flat_map[Key, T] ()
    extends tstlLib.experimentalMod.flat_map[Key, T] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: tstlLib.experimentalContainerFlatMapMod.FlatMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ]) = this()
    def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class flat_multimap[Key, T] ()
    extends tstlLib.experimentalMod.flat_multimap[Key, T] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: tstlLib.experimentalContainerFlatMultiMapMod.FlatMultiMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ]) = this()
    def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
          tstlLib.utilityIPairMod.IPair[Key, T], 
          tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
        ], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class flat_multiset[Key] ()
    extends tstlLib.experimentalMod.flat_multiset[Key] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: tstlLib.experimentalContainerFlatMultiSetMod.FlatMultiSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]) = this()
    def this(items: js.Array[Key], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class flat_set[Key] ()
    extends tstlLib.experimentalMod.flat_set[Key] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: tstlLib.experimentalContainerFlatSetMod.FlatSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]) = this()
    def this(items: js.Array[Key], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
    def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  }
  
  val barrier: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadBarrierMod.Barrier] = js.native
  val couting_semaphore: org.scalablytyped.runtime.Instantiable1[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Max */ /* max */ js.Any, 
    tstlLib.experimentalThreadSemaphoreMod.Semaphore[scala.Double]
  ] = js.native
  val flex_barrier: org.scalablytyped.runtime.Instantiable2[
    /* size */ scala.Double, 
    js.UndefOr[/* complete */ js.Function0[scala.Double]], 
    tstlLib.experimentalThreadFlexBarrierMod.FlexBarrier
  ] = js.native
  val latch: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadLatchMod.Latch] = js.native
  def erase[Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[
      tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      Container
    ], 
    tstlLib.tstlLibStrings.remove_if
  ] */](
    contaier: Container,
    `val`: tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container]
  ): scala.Unit = js.native
  @JSName("erase")
  def erase_ContainerIErasableContainerIteratorIForwardIterator[Container /* <: tstlLib.experimentalAlgorithmMod.IErasableContainer[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: Container, `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator]): scala.Unit = js.native
  def erase_if[Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[
      tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      Container
    ], 
    tstlLib.tstlLibStrings.remove_if
  ] */](
    contaier: Container,
    predicator: js.Function1[
      /* val */ tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  @JSName("erase_if")
  def erase_if_ContainerIErasableContainerIteratorIForwardIterator[Container /* <: tstlLib.experimentalAlgorithmMod.IErasableContainer[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](
    container: Container,
    predicator: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  @JSName("FlatMap")
  @js.native
  object FlatMapNs extends js.Object {
    val Iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
  @JSName("FlatMultiMap")
  @js.native
  object FlatMultiMapNs extends js.Object {
    val Iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
  @JSName("FlatMultiSet")
  @js.native
  object FlatMultiSetNs extends js.Object {
    val Iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
  @JSName("FlatSet")
  @js.native
  object FlatSetNs extends js.Object {
    val Iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
  @JSName("flat_map")
  @js.native
  object flatUnderscoreMapNs extends js.Object {
    val Iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
  @JSName("flat_multimap")
  @js.native
  object flatUnderscoreMultimapNs extends js.Object {
    val Iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
          js.Object, 
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerMapContainerMod.MapContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
  @JSName("flat_multiset")
  @js.native
  object flatUnderscoreMultisetNs extends js.Object {
    val Iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
  @JSName("flat_set")
  @js.native
  object flatUnderscoreSetNs extends js.Object {
    val Iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val reverse_iterator: org.scalablytyped.runtime.Instantiable0[
        tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
          js.Object, 
          scala.Boolean, 
          tstlLib.baseContainerSetContainerMod.SetContainer[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.Iterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ], 
            tstlLib.baseContainerSetElementVectorMod.SetElementVectorNs.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
  }
  
}

