package typings.webpack

import typings.webpack.webpackMod._RuleSetCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_And extends _RuleSetCondition {
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
  var exclude: js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias webpack.webpack.RuleSetCondition */ js.Object
  ] = js.undefined
  /**
    * Exclude all modules matching not any of these conditions
    */
  var include: js.UndefOr[
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
  var test: js.UndefOr[
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
    if (and != null) __obj.updateDynamic("and")(and.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (or != null) __obj.updateDynamic("or")(or.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_And]
  }
}

