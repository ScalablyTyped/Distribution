package typings.toJsonSchema.mod

import typings.jsonSchema.mod.JSONSchema4TypeName
import typings.toJsonSchema.anon.AdditionalProperties
import typings.toJsonSchema.anon.DetectFormat
import typings.toJsonSchema.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arrays: js.UndefOr[Mode] = js.native
  var objects: js.UndefOr[AdditionalProperties] = js.native
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
  ] = js.native
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
  var required: js.UndefOr[Boolean] = js.native
  var strings: js.UndefOr[DetectFormat] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrays(value: Mode): Self = this.set("arrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrays: Self = this.set("arrays", js.undefined)
    @scala.inline
    def setObjects(value: AdditionalProperties): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    @scala.inline
    def setPostProcessFnc(
      value: (/* type */ JSONSchema4TypeName, /* schema */ JSONSchema3or4, /* value */ js.Any, /* defaultFunc */ js.Function3[
          /* type */ JSONSchema4TypeName, 
          /* schema */ JSONSchema3or4, 
          /* value */ js.Any, 
          JSONSchema3or4
        ]) => JSONSchema3or4
    ): Self = this.set("postProcessFnc", js.Any.fromFunction4(value))
    @scala.inline
    def deletePostProcessFnc: Self = this.set("postProcessFnc", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setStrings(value: DetectFormat): Self = this.set("strings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
  }
  
}

