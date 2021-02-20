package typings.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegExp {
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
  
  @js.native
  trait ChainableBase[RawValue] extends StObject {
    
    def addFlags(flags: java.lang.String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
    
    def exec(string: java.lang.String): SugarDefaultChainable[RegExpExecArray | Null] = js.native
    
    def getFlags(): SugarDefaultChainable[java.lang.String] = js.native
    
    var raw: RawValue = js.native
    
    def removeFlags(flags: java.lang.String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
    
    def setFlags(flags: java.lang.String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
    
    def test(string: java.lang.String): SugarDefaultChainable[Boolean] = js.native
  }
  object ChainableBase {
    
    @scala.inline
    def apply[RawValue](
      addFlags: java.lang.String => SugarDefaultChainable[typings.sugar.RegExp],
      exec: java.lang.String => SugarDefaultChainable[RegExpExecArray | Null],
      getFlags: () => SugarDefaultChainable[java.lang.String],
      raw: RawValue,
      removeFlags: java.lang.String => SugarDefaultChainable[typings.sugar.RegExp],
      setFlags: java.lang.String => SugarDefaultChainable[typings.sugar.RegExp],
      test: java.lang.String => SugarDefaultChainable[Boolean]
    ): ChainableBase[RawValue] = {
      val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction1(addFlags), exec = js.Any.fromFunction1(exec), getFlags = js.Any.fromFunction0(getFlags), raw = raw.asInstanceOf[js.Any], removeFlags = js.Any.fromFunction1(removeFlags), setFlags = js.Any.fromFunction1(setFlags), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[ChainableBase[RawValue]]
    }
    
    @scala.inline
    implicit class ChainableBaseMutableBuilder[Self <: ChainableBase[_], RawValue] (val x: Self with ChainableBase[RawValue]) extends AnyVal {
      
      @scala.inline
      def setAddFlags(value: java.lang.String => SugarDefaultChainable[typings.sugar.RegExp]): Self = StObject.set(x, "addFlags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExec(value: java.lang.String => SugarDefaultChainable[RegExpExecArray | Null]): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFlags(value: () => SugarDefaultChainable[java.lang.String]): Self = StObject.set(x, "getFlags", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRaw(value: RawValue): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFlags(value: java.lang.String => SugarDefaultChainable[typings.sugar.RegExp]): Self = StObject.set(x, "removeFlags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFlags(value: java.lang.String => SugarDefaultChainable[typings.sugar.RegExp]): Self = StObject.set(x, "setFlags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTest(value: java.lang.String => SugarDefaultChainable[Boolean]): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Constructor
    extends SugarNamespace
       with Instantiable0[Chainable[typings.sugar.RegExp]]
       with Instantiable1[/* raw */ typings.sugar.RegExp, Chainable[typings.sugar.RegExp]] {
    
    def apply(): Chainable[typings.sugar.RegExp] = js.native
    def apply(raw: typings.sugar.RegExp): Chainable[typings.sugar.RegExp] = js.native
    
    def addFlags(instance: typings.sugar.RegExp, flags: java.lang.String): typings.sugar.RegExp = js.native
    
    def escape(): java.lang.String = js.native
    def escape(str: java.lang.String): java.lang.String = js.native
    
    def getFlags(instance: typings.sugar.RegExp): java.lang.String = js.native
    
    def removeFlags(instance: typings.sugar.RegExp, flags: java.lang.String): typings.sugar.RegExp = js.native
    
    def setFlags(instance: typings.sugar.RegExp, flags: java.lang.String): typings.sugar.RegExp = js.native
  }
}
