package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptTarget extends js.Object

@JSImport("typescript", "ScriptTarget")
@js.native
object ScriptTarget extends js.Object {
  @js.native
  sealed trait ES2015
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait ES2016
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait ES2017
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait ES2018
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait ES2019
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait ES2020
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait ES3
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait ES5
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait ESNext
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait JSON
    extends typescriptLib.typescriptMod.ScriptTarget
  
  @js.native
  sealed trait Latest
    extends typescriptLib.typescriptMod.ScriptTarget
  
  /* 2 */ val ES2015: ES2015 with scala.Double = js.native
  /* 3 */ val ES2016: ES2016 with scala.Double = js.native
  /* 4 */ val ES2017: ES2017 with scala.Double = js.native
  /* 5 */ val ES2018: ES2018 with scala.Double = js.native
  /* 6 */ val ES2019: ES2019 with scala.Double = js.native
  /* 7 */ val ES2020: ES2020 with scala.Double = js.native
  /* 0 */ val ES3: ES3 with scala.Double = js.native
  /* 1 */ val ES5: ES5 with scala.Double = js.native
  /* 8 */ val ESNext: ESNext with scala.Double = js.native
  /* 100 */ val JSON: JSON with scala.Double = js.native
  /* 8 */ val Latest: Latest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.ScriptTarget with scala.Double] = js.native
}

