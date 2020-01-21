package typings.toJsonSchema.mod

import typings.jsonSchema.mod.JSONSchema4TypeName
import typings.toJsonSchema.AnonAdditionalProperties
import typings.toJsonSchema.AnonAll
import typings.toJsonSchema.AnonDefaultFnc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrays: js.UndefOr[AnonAll] = js.undefined
  var objects: js.UndefOr[AnonAdditionalProperties] = js.undefined
  /**
    * By providing `postProcessFnc`, you can modify or replace generated
    * schema. This function will be called recursively for all the properties
    * and sub-properties and array items from leaves to the root. If you want
    * to preserve default functionality, don't forget to call defaultFunc
    * which is currently responsible for setting `required` for the schema
    * items if there is common option `required` set to true.
    *
    * @param type JSON schema type of the `value`
    * @param schema Generated JSON schema
    * @param value - input value
    * @param defaultFunc standard function that is used to post-process
    *                    generated schema. Takes the `type`, `schema`,
    *                    `value` params.
    */
  var postProcessFnc: js.UndefOr[
    js.Function4[
      /* type */ JSONSchema4TypeName, 
      /* schema */ JSONSchema3or4, 
      /* value */ js.Any, 
      /* defaultFunc */ js.Function3[
        /* type */ JSONSchema4TypeName, 
        /* schema */ JSONSchema3or4, 
        /* value */ js.Any, 
        JSONSchema3or4
      ], 
      JSONSchema3or4
    ]
  ] = js.undefined
  /**
    * specify `true` to make all properties required.
    *
    * @default false
    * @example
    * const schema = toJsonSchema(33, {required: false});
    * // { type: "integer" }
    * const schema = toJsonSchema(33, {required: true});
    * // { type: "integer", "required": true }
    */
  var required: js.UndefOr[Boolean] = js.undefined
  var strings: js.UndefOr[AnonDefaultFnc] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrays: AnonAll = null,
    objects: AnonAdditionalProperties = null,
    postProcessFnc: (/* type */ JSONSchema4TypeName, /* schema */ JSONSchema3or4, /* value */ js.Any, /* defaultFunc */ js.Function3[
      /* type */ JSONSchema4TypeName, 
      /* schema */ JSONSchema3or4, 
      /* value */ js.Any, 
      JSONSchema3or4
    ]) => JSONSchema3or4 = null,
    required: js.UndefOr[Boolean] = js.undefined,
    strings: AnonDefaultFnc = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrays != null) __obj.updateDynamic("arrays")(arrays.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (postProcessFnc != null) __obj.updateDynamic("postProcessFnc")(js.Any.fromFunction4(postProcessFnc))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

