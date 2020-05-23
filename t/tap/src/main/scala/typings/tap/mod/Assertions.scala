package typings.tap.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.RegExp
import typings.tap.mod.Options.Assert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tap", "Assertions")
@js.native
object Assertions extends js.Object {
  @js.native
  trait Throws extends js.Object {
    def apply(): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], expectedError: Error): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], expectedError: Error, message: String): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], expectedError: Error, message: String, extra: Assert): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], messageOrExpectedError: String): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], messageOrExpectedError: String, extra: Assert): Boolean = js.native
    def apply(fn: js.Function1[/* repeated */ js.Any, _], messageOrExpectedError: Error, extra: Assert): Boolean = js.native
  }
  
  type Basic = js.Function3[
    /* obj */ js.Any, 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  type DoesNotThrow = js.Function3[
    /* fn */ js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]], 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  type Equal = js.Function4[
    /* found */ js.Any, 
    /* wanted */ js.Any, 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  type Match = js.Function4[
    /* found */ js.Any, 
    /* pattern */ String | RegExp | StringDictionary[RegExp], 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  type NotEqual = js.Function4[
    /* found */ js.Any, 
    /* notWanted */ js.Any, 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
  type Type = js.Function4[
    /* found */ js.Any, 
    /* type */ String | (Instantiable1[/* args (repeated) */ js.Any, js.Object]), 
    /* message */ js.UndefOr[String], 
    /* extra */ js.UndefOr[Assert], 
    Boolean
  ]
}

