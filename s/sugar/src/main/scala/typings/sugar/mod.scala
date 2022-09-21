package typings.sugar

import org.scalablytyped.runtime.Shortcut
import typings.std.ArrayLike
import typings.std.RegExpExecArray
import typings.sugar.sugarjs.Array.Chainable
import typings.sugar.sugarjs.Date.DateCreateOptions
import typings.sugar.sugarjs.Object.ChainableBase
import typings.sugar.sugarjs.Sugar
import typings.sugar.sugarjs.SugarDefaultChainable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sugar", JSImport.Namespace)
  @js.native
  val ^ : Sugar = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sugar", "Array")
  @js.native
  open class Array[T] ()
    extends StObject
       with Chainable[T, typings.sugar.Array[T]] {
    def this(obj: Double) = this()
    def this(obj: ArrayLike[T]) = this()
    def this(obj: Double, clone: Boolean) = this()
    def this(obj: Unit, clone: Boolean) = this()
    def this(obj: ArrayLike[T], clone: Boolean) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sugar", "Date")
  @js.native
  open class Date ()
    extends StObject
       with typings.sugar.sugarjs.Date.Chainable[typings.sugar.Date] {
    def this(d: java.lang.String) = this()
    def this(d: Double) = this()
    def this(d: typings.sugar.Date) = this()
    def this(d: java.lang.String, options: DateCreateOptions) = this()
    def this(d: Double, options: DateCreateOptions) = this()
    def this(d: Unit, options: DateCreateOptions) = this()
    def this(d: typings.sugar.Date, options: DateCreateOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sugar", "Function")
  @js.native
  open class Function ()
    extends StObject
       with typings.sugar.sugarjs.Function.Chainable[typings.sugar.Function] {
    def this(raw: typings.sugar.Function) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sugar", "Number")
  @js.native
  open class Number ()
    extends StObject
       with typings.sugar.sugarjs.Number.Chainable[Double] {
    def this(raw: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sugar", "Object")
  @js.native
  open class Object ()
    extends StObject
       with ChainableBase[js.Object] {
    def this(raw: js.Object) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sugar", "RegExp")
  @js.native
  open class RegExp ()
    extends StObject
       with typings.sugar.sugarjs.RegExp.Chainable[typings.sugar.RegExp] {
    def this(raw: typings.sugar.RegExp) = this()
    
    /* CompleteClass */
    override def addFlags(flags: java.lang.String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
    
    /* CompleteClass */
    override def exec(string: java.lang.String): SugarDefaultChainable[RegExpExecArray | Null] = js.native
    
    /* CompleteClass */
    override def getFlags(): SugarDefaultChainable[java.lang.String] = js.native
    
    /* CompleteClass */
    var raw: typings.sugar.RegExp = js.native
    
    /* CompleteClass */
    override def removeFlags(flags: java.lang.String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
    
    /* CompleteClass */
    override def setFlags(flags: java.lang.String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
    
    /* CompleteClass */
    override def test(string: java.lang.String): SugarDefaultChainable[Boolean] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sugar", "String")
  @js.native
  open class String ()
    extends StObject
       with typings.sugar.sugarjs.String.Chainable[java.lang.String] {
    def this(raw: java.lang.String) = this()
  }
  
  type _To = Sugar
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Sugar = ^
}
