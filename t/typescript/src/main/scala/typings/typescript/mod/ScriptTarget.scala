package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptTarget extends StObject
@JSImport("typescript", "ScriptTarget")
@js.native
object ScriptTarget extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptTarget with Double] = js.native
  
  @js.native
  sealed trait ES2015 extends ScriptTarget
  /* 2 */ val ES2015: typings.typescript.mod.ScriptTarget.ES2015 with Double = js.native
  
  @js.native
  sealed trait ES2016 extends ScriptTarget
  /* 3 */ val ES2016: typings.typescript.mod.ScriptTarget.ES2016 with Double = js.native
  
  @js.native
  sealed trait ES2017 extends ScriptTarget
  /* 4 */ val ES2017: typings.typescript.mod.ScriptTarget.ES2017 with Double = js.native
  
  @js.native
  sealed trait ES2018 extends ScriptTarget
  /* 5 */ val ES2018: typings.typescript.mod.ScriptTarget.ES2018 with Double = js.native
  
  @js.native
  sealed trait ES2019 extends ScriptTarget
  /* 6 */ val ES2019: typings.typescript.mod.ScriptTarget.ES2019 with Double = js.native
  
  @js.native
  sealed trait ES2020 extends ScriptTarget
  /* 7 */ val ES2020: typings.typescript.mod.ScriptTarget.ES2020 with Double = js.native
  
  @js.native
  sealed trait ES3 extends ScriptTarget
  /* 0 */ val ES3: typings.typescript.mod.ScriptTarget.ES3 with Double = js.native
  
  @js.native
  sealed trait ES5 extends ScriptTarget
  /* 1 */ val ES5: typings.typescript.mod.ScriptTarget.ES5 with Double = js.native
  
  @js.native
  sealed trait ESNext extends ScriptTarget
  /* 99 */ val ESNext: typings.typescript.mod.ScriptTarget.ESNext with Double = js.native
  
  @js.native
  sealed trait JSON extends ScriptTarget
  /* 100 */ val JSON: typings.typescript.mod.ScriptTarget.JSON with Double = js.native
  
  @js.native
  sealed trait Latest extends ScriptTarget
  /* 99 */ val Latest: typings.typescript.mod.ScriptTarget.Latest with Double = js.native
}
