package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptTarget extends js.Object
@JSImport("typescript", "ScriptTarget")
@js.native
object ScriptTarget extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptTarget with Double] = js.native
  
  @js.native
  sealed trait ES2015 extends ScriptTarget
  /* 2 */ @js.native
  object ES2015 extends TopLevel[ES2015 with Double]
  
  @js.native
  sealed trait ES2016 extends ScriptTarget
  /* 3 */ @js.native
  object ES2016 extends TopLevel[ES2016 with Double]
  
  @js.native
  sealed trait ES2017 extends ScriptTarget
  /* 4 */ @js.native
  object ES2017 extends TopLevel[ES2017 with Double]
  
  @js.native
  sealed trait ES2018 extends ScriptTarget
  /* 5 */ @js.native
  object ES2018 extends TopLevel[ES2018 with Double]
  
  @js.native
  sealed trait ES2019 extends ScriptTarget
  /* 6 */ @js.native
  object ES2019 extends TopLevel[ES2019 with Double]
  
  @js.native
  sealed trait ES2020 extends ScriptTarget
  /* 7 */ @js.native
  object ES2020 extends TopLevel[ES2020 with Double]
  
  @js.native
  sealed trait ES3 extends ScriptTarget
  /* 0 */ @js.native
  object ES3 extends TopLevel[ES3 with Double]
  
  @js.native
  sealed trait ES5 extends ScriptTarget
  /* 1 */ @js.native
  object ES5 extends TopLevel[ES5 with Double]
  
  @js.native
  sealed trait ESNext extends ScriptTarget
  /* 99 */ @js.native
  object ESNext extends TopLevel[ESNext with Double]
  
  @js.native
  sealed trait JSON extends ScriptTarget
  /* 100 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  @js.native
  sealed trait Latest extends ScriptTarget
  /* 99 */ @js.native
  object Latest extends TopLevel[Latest with Double]
}
