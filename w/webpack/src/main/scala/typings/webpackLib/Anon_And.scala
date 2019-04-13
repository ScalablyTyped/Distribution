package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_And
  extends webpackLib.webpackMod._RuleSetCondition {
  /**
    * Logical AND
    */
  var and: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
    ]
  ] = js.undefined
  /**
    * Exclude all modules matching any of these conditions
    */
  var exclude: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
  ] = js.undefined
  /**
    * Exclude all modules matching not any of these conditions
    */
  var include: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
  ] = js.undefined
  /**
    * Logical NOT
    */
  var not: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
    ]
  ] = js.undefined
  /**
    * Logical OR
    */
  var or: js.UndefOr[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
    ]
  ] = js.undefined
  /**
    * Exclude all modules matching any of these conditions
    */
  var test: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
  ] = js.undefined
}

object Anon_And {
  @scala.inline
  def apply(
    and: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
    ] = null,
    exclude: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object = null,
    include: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object = null,
    not: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
    ] = null,
    or: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
    ] = null,
    test: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object = null
  ): Anon_And = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(and)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    if (not != null) __obj.updateDynamic("not")(not)
    if (or != null) __obj.updateDynamic("or")(or)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_And]
  }
}

