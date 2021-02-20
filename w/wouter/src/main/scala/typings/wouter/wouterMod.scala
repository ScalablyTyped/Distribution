package typings.wouter

import typings.wouter.anon.ReadonlyArrayPathConcat
import typings.wouter.wouterUseLocationMod.LocationHook
import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wouterMod {
  
  @JSImport("wouter/static-location", JSImport.Default)
  @js.native
  def default(): StaticLocationHook = js.native
  @JSImport("wouter/static-location", JSImport.Default)
  @js.native
  def default(path: js.UndefOr[scala.Nothing], options: StaticLocationHookOptions): StaticLocationHook = js.native
  @JSImport("wouter/static-location", JSImport.Default)
  @js.native
  def default(path: Path): StaticLocationHook = js.native
  @JSImport("wouter/static-location", JSImport.Default)
  @js.native
  def default(path: Path, options: StaticLocationHookOptions): StaticLocationHook = js.native
  
  @js.native
  trait StaticLocationHook extends LocationHook {
    
    var history: ReadonlyArrayPathConcat = js.native
  }
  
  @js.native
  trait StaticLocationHookOptions extends StObject {
    
    var record: js.UndefOr[Boolean] = js.native
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
