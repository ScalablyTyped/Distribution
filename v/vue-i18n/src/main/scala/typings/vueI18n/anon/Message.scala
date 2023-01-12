package typings.vueI18n.anon

import typings.intlifyCoreBase.mod.RemoveIndexSignature
import typings.vueI18n.mod.DefaultDateTimeFormatSchema
import typings.vueI18n.mod.DefaultLocaleMessageSchema
import typings.vueI18n.mod.DefaultNumberFormatSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var datetime: DefaultDateTimeFormatSchema[js.Object]
  
  var message: DefaultLocaleMessageSchema[
    RemoveIndexSignature[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
    ]
  ]
  
  var number: DefaultNumberFormatSchema[js.Object]
}
object Message {
  
  inline def apply(
    datetime: DefaultDateTimeFormatSchema[js.Object],
    message: DefaultLocaleMessageSchema[
      RemoveIndexSignature[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
      ]
    ],
    number: DefaultNumberFormatSchema[js.Object]
  ): Message = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setDatetime(value: DefaultDateTimeFormatSchema[js.Object]): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setMessage(
      value: DefaultLocaleMessageSchema[
          RemoveIndexSignature[
            /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]} */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: DefaultNumberFormatSchema[js.Object]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
