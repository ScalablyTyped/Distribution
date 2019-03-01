package typings
package visionLib.visionMod.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The npm module used for rendering the templates. The module object must contain the compile() function
  * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions} > options > engines > module
  */
trait NpmModule extends js.Object {
  /**
    * The rendering function. The required function signature depends on the compileMode settings
    */
  var compile: ServerViewCompile
  /**
    * Initializes additional engine state.The config object is the engine configuration object allowing updates to be made.
    * This is useful for engines like Nunjucks that rely on additional state for rendering. next has the signature function(err).
    */
  var prepare: js.UndefOr[
    js.Function2[
      /* config */ EngineConfigurationObject, 
      /* next */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Registers a helper for use during template rendering.
    * The name is the name that templates should use to reference the helper and helper is the function that will be invoked when the helper is called.
    */
  var registerHelper: js.UndefOr[
    js.Function2[
      /* name */ java.lang.String, 
      /* helper */ js.Function1[/* repeated */ js.Any, _], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Registers a partial for use during template rendering.
    * The name is the partial path that templates should use to reference the partial and src is the uncompiled template string for the partial.
    */
  var registerPartial: js.UndefOr[
    js.Function2[/* name */ java.lang.String, /* src */ java.lang.String, scala.Unit]
  ] = js.undefined
}

object NpmModule {
  @scala.inline
  def apply(
    compile: ServerViewCompile,
    prepare: js.Function2[
      /* config */ EngineConfigurationObject, 
      /* next */ js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit], 
      scala.Unit
    ] = null,
    registerHelper: js.Function2[
      /* name */ java.lang.String, 
      /* helper */ js.Function1[/* repeated */ js.Any, _], 
      scala.Unit
    ] = null,
    registerPartial: js.Function2[/* name */ java.lang.String, /* src */ java.lang.String, scala.Unit] = null
  ): NpmModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compile")(compile.asInstanceOf[js.Any])
    if (prepare != null) __obj.updateDynamic("prepare")(prepare)
    if (registerHelper != null) __obj.updateDynamic("registerHelper")(registerHelper)
    if (registerPartial != null) __obj.updateDynamic("registerPartial")(registerPartial)
    __obj.asInstanceOf[NpmModule]
  }
}

