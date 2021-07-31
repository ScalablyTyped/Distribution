package typings.wouter

import typings.wouter.anon.ReadonlyArrayPathConcat
import typings.wouter.wouterUseLocationMod.LocationHook
import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wouterMod {
  
  @JSImport("wouter/static-location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): StaticLocationHook = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[StaticLocationHook]
  @scala.inline
  def default(path: Unit, options: StaticLocationHookOptions): StaticLocationHook = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StaticLocationHook]
  @scala.inline
  def default(path: Path): StaticLocationHook = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[StaticLocationHook]
  @scala.inline
  def default(path: Path, options: StaticLocationHookOptions): StaticLocationHook = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StaticLocationHook]
  
  @js.native
  trait StaticLocationHook extends LocationHook {
    
    var history: ReadonlyArrayPathConcat = js.native
  }
  
  trait StaticLocationHookOptions extends StObject {
    
    var record: js.UndefOr[Boolean] = js.undefined
  }
  object StaticLocationHookOptions {
    
    @scala.inline
    def apply(): StaticLocationHookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticLocationHookOptions]
    }
    
    @scala.inline
    implicit class StaticLocationHookOptionsMutableBuilder[Self <: StaticLocationHookOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecord(value: Boolean): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    }
  }
}
