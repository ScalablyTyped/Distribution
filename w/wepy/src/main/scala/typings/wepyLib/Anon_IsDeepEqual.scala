package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_IsDeepEqual extends js.Object {
  @JSName("$copy")
  var $copy: js.Function2[/* obj */ js.Any, /* deep */ js.UndefOr[scala.Boolean], _]
  @JSName("$extend")
  var $extend: js.Function0[_]
  @JSName("$getParams")
  var $getParams: js.Function1[/* url */ java.lang.String, js.Object]
  @JSName("$has")
  var $has: js.Function2[/* obj */ js.Object, /* path */ java.lang.String, scala.Boolean]
  @JSName("$isDeepEqual")
  var $isDeepEqual: js.Function4[
    /* a */ js.Any, 
    /* b */ js.Any, 
    /* aStack */ js.UndefOr[js.Array[_]], 
    /* bStack */ js.UndefOr[js.Array[_]], 
    scala.Boolean
  ]
  @JSName("$isEmpty")
  var $isEmpty: js.Function1[/* obj */ js.Object, scala.Boolean]
  @JSName("$isEqual")
  var $isEqual: js.Function4[
    /* a */ js.Any, 
    /* b */ js.Any, 
    /* aStack */ js.UndefOr[js.Array[_]], 
    /* bStack */ js.UndefOr[js.Array[_]], 
    scala.Boolean
  ]
  @JSName("$isPlainObject")
  var $isPlainObject: js.Function1[/* obj */ js.Any, scala.Boolean]
  @JSName("$resolvePath")
  var $resolvePath: js.Function2[/* route */ java.lang.String, /* url */ java.lang.String, java.lang.String]
  var camelize: js.Function1[/* str */ java.lang.String, java.lang.String]
  var hyphenate: js.Function1[/* str */ java.lang.String, java.lang.String]
}

