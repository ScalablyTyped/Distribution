package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptTarget extends StObject
@JSImport("typescript", "ScriptTarget")
@js.native
object ScriptTarget extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptTarget & Double] = js.native
  
  @js.native
  sealed trait ES2015
    extends StObject
       with ScriptTarget
  /* 2 */ val ES2015: typings.typescript.mod.ScriptTarget.ES2015 & Double = js.native
  
  @js.native
  sealed trait ES2016
    extends StObject
       with ScriptTarget
  /* 3 */ val ES2016: typings.typescript.mod.ScriptTarget.ES2016 & Double = js.native
  
  @js.native
  sealed trait ES2017
    extends StObject
       with ScriptTarget
  /* 4 */ val ES2017: typings.typescript.mod.ScriptTarget.ES2017 & Double = js.native
  
  @js.native
  sealed trait ES2018
    extends StObject
       with ScriptTarget
  /* 5 */ val ES2018: typings.typescript.mod.ScriptTarget.ES2018 & Double = js.native
  
  @js.native
  sealed trait ES2019
    extends StObject
       with ScriptTarget
  /* 6 */ val ES2019: typings.typescript.mod.ScriptTarget.ES2019 & Double = js.native
  
  @js.native
  sealed trait ES2020
    extends StObject
       with ScriptTarget
  /* 7 */ val ES2020: typings.typescript.mod.ScriptTarget.ES2020 & Double = js.native
  
  @js.native
  sealed trait ES3
    extends StObject
       with ScriptTarget
  /* 0 */ val ES3: typings.typescript.mod.ScriptTarget.ES3 & Double = js.native
  
  @js.native
  sealed trait ES5
    extends StObject
       with ScriptTarget
  /* 1 */ val ES5: typings.typescript.mod.ScriptTarget.ES5 & Double = js.native
  
  @js.native
  sealed trait ESNext
    extends StObject
       with ScriptTarget
  /* 99 */ val ESNext: typings.typescript.mod.ScriptTarget.ESNext & Double = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with ScriptTarget
  /* 100 */ val JSON: typings.typescript.mod.ScriptTarget.JSON & Double = js.native
  
  @js.native
  sealed trait Latest
    extends StObject
       with ScriptTarget
  /* 99 */ val Latest: typings.typescript.mod.ScriptTarget.Latest & Double = js.native
}
