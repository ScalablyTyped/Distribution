package typings.toDashJsonDashSchema

import typings.toDashJsonDashSchema.toDashJsonDashSchemaMod.JSONSchema3or4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalProperties extends js.Object {
  /**
    * if set to `false`, all object schemas will include JSON schema
    * property `additionalProperties: false` which makes generated schema
    * to perevent any extra properties.
    *
    * @default true
    */
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * By providing `postProcessFnc`, you can modify or replace generated
    * schema. This function will be called recursively for all the
    * properties and sub-properties and array items from leaves to the root
    * of the `obj` object.
    *
    * @param schema Generated JSON schema
    * @param obj input value
    * @param defaultFunc standard function that is used to post-process
    *                    generated schema. Takes the `schema`, `obj`
    *                    params.
    */
  var postProcessFnc: js.UndefOr[
    js.Function3[
      /* schema */ JSONSchema3or4, 
      /* obj */ js.Any, 
      /* defaultFnc */ js.Function2[/* schema */ JSONSchema3or4, /* obj */ js.Any, JSONSchema3or4], 
      JSONSchema3or4
    ]
  ] = js.undefined
  /**
    * By providing custom function you will be able to modify any object
    * value (including nested ones) and pre-process it before it gets
    * converted into schema or modify generated schema or do the schema
    * conversion entirely by yourself.
    *
    * @param obj input object value that is supposed to be converted into
    *            JSON schema
    * @param defaultFunc standard function that is used to generate schema
    *                    from object. Takes just the `obj` param.
    */
  var preProcessFnc: js.UndefOr[
    js.Function2[
      /* obj */ js.Any, 
      /* defaultFunc */ js.Function1[/* obj */ js.Any, JSONSchema3or4], 
      JSONSchema3or4
    ]
  ] = js.undefined
}

object Anon_AdditionalProperties {
  @scala.inline
  def apply(
    additionalProperties: js.UndefOr[Boolean] = js.undefined,
    postProcessFnc: (/* schema */ JSONSchema3or4, /* obj */ js.Any, /* defaultFnc */ js.Function2[/* schema */ JSONSchema3or4, /* obj */ js.Any, JSONSchema3or4]) => JSONSchema3or4 = null,
    preProcessFnc: (/* obj */ js.Any, /* defaultFunc */ js.Function1[/* obj */ js.Any, JSONSchema3or4]) => JSONSchema3or4 = null
  ): Anon_AdditionalProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalProperties)) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (postProcessFnc != null) __obj.updateDynamic("postProcessFnc")(js.Any.fromFunction3(postProcessFnc))
    if (preProcessFnc != null) __obj.updateDynamic("preProcessFnc")(js.Any.fromFunction2(preProcessFnc))
    __obj.asInstanceOf[Anon_AdditionalProperties]
  }
}

