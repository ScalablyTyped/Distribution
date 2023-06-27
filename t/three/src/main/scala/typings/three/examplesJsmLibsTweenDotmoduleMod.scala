package typings.three

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.three.threeBooleans.`false`
import typings.tweenjsTweenJs.anon.Bernstein
import typings.tweenjsTweenJs.anon.Bezier
import typings.tweenjsTweenJs.anon.ReadonlyEasingFunctionGro
import typings.tweenjsTweenJs.anon.ReadonlyEasingFunctionGroIn
import typings.tweenjsTweenJs.anon.ReadonlyLinearReadonlyEas
import typings.tweenjsTweenJs.anon.TypeofSequence
import typings.tweenjsTweenJs.mod.EasingFunctionGroup
import typings.tweenjsTweenJs.mod.UnknownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLibsTweenDotmoduleMod {
  
  @JSImport("three/examples/jsm/libs/tween.module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("three/examples/jsm/libs/tween.module", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "default.Easing")
    @js.native
    def Easing: ReadonlyLinearReadonlyEas = js.native
    inline def Easing_=(x: ReadonlyLinearReadonlyEas): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easing")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("three/examples/jsm/libs/tween.module", "default.Group")
    @js.native
    open class Group ()
      extends typings.tweenjsTweenJs.mod.Group
    @JSImport("three/examples/jsm/libs/tween.module", "default.Group")
    @js.native
    def Group: Instantiable0[typings.tweenjsTweenJs.mod.Group] = js.native
    inline def Group_=(x: Instantiable0[typings.tweenjsTweenJs.mod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/libs/tween.module", "default.Interpolation")
    @js.native
    def Interpolation: Bezier = js.native
    inline def Interpolation_=(x: Bezier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Interpolation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("three/examples/jsm/libs/tween.module", "default.Sequence")
    @js.native
    open class Sequence ()
      extends typings.tweenjsTweenJs.mod.Sequence
    @JSImport("three/examples/jsm/libs/tween.module", "default.Sequence")
    @js.native
    def Sequence: TypeofSequence & Instantiable0[typings.tweenjsTweenJs.mod.Sequence] = js.native
    inline def Sequence_=(x: TypeofSequence & Instantiable0[typings.tweenjsTweenJs.mod.Sequence]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("three/examples/jsm/libs/tween.module", "default.Tween")
    @js.native
    open class Tween[T /* <: UnknownProps */] protected ()
      extends typings.tweenjsTweenJs.mod.Tween[T] {
      def this(_object: /* import warning: RewrittenClass.unapply cls was tparam T */ Any) = this()
      def this(_object: /* import warning: RewrittenClass.unapply cls was tparam T */ Any, _group: `false`) = this()
      def this(
        _object: /* import warning: RewrittenClass.unapply cls was tparam T */ Any,
        _group: typings.tweenjsTweenJs.mod.Group
      ) = this()
    }
    @JSImport("three/examples/jsm/libs/tween.module", "default.Tween")
    @js.native
    def Tween: Instantiable2[
        /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ Any, 
        /* _group */ js.UndefOr[typings.tweenjsTweenJs.mod.Group | `false`], 
        typings.tweenjsTweenJs.mod.Tween[UnknownProps]
      ] = js.native
    inline def Tween_=(
      x: Instantiable2[
          /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ Any, 
          /* _group */ js.UndefOr[typings.tweenjsTweenJs.mod.Group | `false`], 
          typings.tweenjsTweenJs.mod.Tween[UnknownProps]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/libs/tween.module", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    inline def add(tween: typings.tweenjsTweenJs.mod.Tween[UnknownProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getAll(): js.Array[typings.tweenjsTweenJs.mod.Tween[UnknownProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Array[typings.tweenjsTweenJs.mod.Tween[UnknownProps]]]
    
    inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
    @JSImport("three/examples/jsm/libs/tween.module", "default.nextId")
    @js.native
    def nextId_Fdefault: js.Function0[Double] = js.native
    
    inline def nextId_Fdefault_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextId")(x.asInstanceOf[js.Any])
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    inline def remove(tween: typings.tweenjsTweenJs.mod.Tween[UnknownProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
    
    inline def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
    inline def update(time: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def update(time: Double, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def update(time: Unit, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  /**
    * The Ease class provides a collection of easing functions for use with tween.js.
    */
  /* Inlined std.Readonly<{  Linear :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup & {  None :@tweenjs/tween.js.@tweenjs/tween.js.EasingFunction}>,   Quadratic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Cubic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Quartic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Quintic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Sinusoidal :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Exponential :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Circular :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Elastic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Back :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Bounce :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>, generatePow (power : number | undefined): @tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup}> */
  object Easing {
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Back")
    @js.native
    val Back: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Bounce")
    @js.native
    val Bounce: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Circular")
    @js.native
    val Circular: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Cubic")
    @js.native
    val Cubic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Elastic")
    @js.native
    val Elastic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Exponential")
    @js.native
    val Exponential: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Linear")
    @js.native
    val Linear: ReadonlyEasingFunctionGroIn = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Quadratic")
    @js.native
    val Quadratic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Quartic")
    @js.native
    val Quartic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Quintic")
    @js.native
    val Quintic: ReadonlyEasingFunctionGro = js.native
    
    @JSImport("three/examples/jsm/libs/tween.module", "Easing.Sinusoidal")
    @js.native
    val Sinusoidal: ReadonlyEasingFunctionGro = js.native
    
    inline def generatePow(): EasingFunctionGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePow")().asInstanceOf[EasingFunctionGroup]
    inline def generatePow(power: Double): EasingFunctionGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePow")(power.asInstanceOf[js.Any]).asInstanceOf[EasingFunctionGroup]
  }
  
  /**
    * Controlling groups of tweens
    *
    * Using the TWEEN singleton to manage your tweens can cause issues in large apps with many components.
    * In these cases, you may want to create your own smaller groups of tween
    */
  @JSImport("three/examples/jsm/libs/tween.module", "Group")
  @js.native
  open class Group ()
    extends typings.tweenjsTweenJs.mod.Group
  
  /**
    *
    */
  object Interpolation {
    
    @JSImport("three/examples/jsm/libs/tween.module", "Interpolation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Bezier(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Bezier")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def CatmullRom(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def Linear(v: js.Array[Double], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Linear")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("three/examples/jsm/libs/tween.module", "Interpolation.Utils")
    @js.native
    def Utils: Bernstein = js.native
    inline def Utils_=(x: Bernstein): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Utils")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Utils
    */
  @JSImport("three/examples/jsm/libs/tween.module", "Sequence")
  @js.native
  open class Sequence ()
    extends typings.tweenjsTweenJs.mod.Sequence
  object Sequence {
    
    @JSImport("three/examples/jsm/libs/tween.module", "Sequence")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("three/examples/jsm/libs/tween.module", "Sequence._nextId")
    @js.native
    def _nextId: Any = js.native
    inline def _nextId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_nextId")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
  }
  
  /**
    * Tween.js - Licensed under the MIT license
    * https://github.com/tweenjs/tween.js
    * ----------------------------------------------
    *
    * See https://github.com/tweenjs/tween.js/graphs/contributors for the full list of contributors.
    * Thank you all, you're awesome!
    */
  @JSImport("three/examples/jsm/libs/tween.module", "Tween")
  @js.native
  open class Tween[T /* <: UnknownProps */] protected ()
    extends typings.tweenjsTweenJs.mod.Tween[T] {
    def this(_object: T) = this()
    def this(_object: T, _group: `false`) = this()
    def this(_object: T, _group: typings.tweenjsTweenJs.mod.Group) = this()
  }
  
  @JSImport("three/examples/jsm/libs/tween.module", "VERSION")
  @js.native
  val VERSION: /* "21.0.0" */ String = js.native
  
  inline def add(tween: typings.tweenjsTweenJs.mod.Tween[UnknownProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAll(): js.Array[typings.tweenjsTweenJs.mod.Tween[UnknownProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Array[typings.tweenjsTweenJs.mod.Tween[UnknownProps]]]
  
  /* static member */
  /* was `typeof Sequence.nextId` */
  inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def remove(tween: typings.tweenjsTweenJs.mod.Tween[UnknownProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tween.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  
  inline def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
  inline def update(time: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def update(time: Double, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def update(time: Unit, preserve: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(time.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
