package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import typings.swaggerSchemaOfficial.anon.AllowEmptyValue
import typings.swaggerSchemaOfficial.anon.CollectionFormat
import typings.swaggerSchemaOfficial.anon.In
import typings.swaggerSchemaOfficial.anon.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BaseFormatContrainedParameter = BaseParameter & SchemaFormatConstraints

type FormDataParameter = BaseFormatContrainedParameter & BaseSchema & AllowEmptyValue

type HeaderParameter = BaseFormatContrainedParameter & BaseSchema & In

type OAuthScope = StringDictionary[String]

type Parameter = BodyParameter | FormDataParameter | QueryParameter | PathParameter | HeaderParameter

type PathParameter = BaseFormatContrainedParameter & BaseSchema & Required

type QueryParameter = BaseFormatContrainedParameter & BaseSchema & CollectionFormat
