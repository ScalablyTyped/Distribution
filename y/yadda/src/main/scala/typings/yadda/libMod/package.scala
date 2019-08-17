package typings.yadda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type Annotations = StringDictionary[String]
  type Converter = (js.Function2[
    /* arg1 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function3[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function4[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function5[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function6[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function7[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* arg6 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ])
  type Step = String
}
