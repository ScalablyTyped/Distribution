package typings.toJsonSchema.anon

import typings.toJsonSchema.mod.JSONSchema3or4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectFormat extends js.Object {
  /**
    * When set to true format of the strings values may be detected based
    * on it's content.
    *
    * These JSON schema string formats can be detected:
    *
    * * date-time
    * * date
    * * time
    * * utc-millisec
    * * color
    * * style
    * * phone
    * * uri
    * * email
    * * ip-address
    * * ipv6
    *
    * @default true
    */
  var detectFormat: js.UndefOr[Boolean] = js.native
  /**
    * By providing custom function you will be able to modify any string
    * value (including nested ones) and pre-process it before it gets
    * converted to schema, modify generated schema or do the schema
    * conversion entirely by yourself.
    *
    * @param value `string` to be converted into JSON schema
    * @param defaultFnc default function that normally generates the
    *                   schema. This function receives only `string` to be
    *                   converted to JSON schema
    */
  var preProcessFnc: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* defaultFnc */ js.Function1[/* value */ String, JSONSchema3or4], 
      JSONSchema3or4
    ]
  ] = js.native
}

object DetectFormat {
  @scala.inline
  def apply(): DetectFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectFormat]
  }
  @scala.inline
  implicit class DetectFormatOps[Self <: DetectFormat] (val x: Self) extends AnyVal {
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
    def setDetectFormat(value: Boolean): Self = this.set("detectFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectFormat: Self = this.set("detectFormat", js.undefined)
    @scala.inline
    def setPreProcessFnc(
      value: (/* value */ String, /* defaultFnc */ js.Function1[/* value */ String, JSONSchema3or4]) => JSONSchema3or4
    ): Self = this.set("preProcessFnc", js.Any.fromFunction2(value))
    @scala.inline
    def deletePreProcessFnc: Self = this.set("preProcessFnc", js.undefined)
  }
  
}

