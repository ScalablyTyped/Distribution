package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import typings.swaggerSchemaOfficial.anon.AllowEmptyValue
import typings.swaggerSchemaOfficial.anon.CollectionFormat
import typings.swaggerSchemaOfficial.anon.In
import typings.swaggerSchemaOfficial.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BaseFormatContrainedParameter = BaseParameter & SchemaFormatConstraints

type FormDataParameter = BaseFormatContrainedParameter & BaseSchema & CollectionFormat

type HeaderParameter = BaseFormatContrainedParameter & BaseSchema & `0`

type OAuthScope = StringDictionary[String]

type Parameter = BodyParameter | FormDataParameter | QueryParameter | PathParameter | HeaderParameter

type PathParameter = BaseFormatContrainedParameter & BaseSchema & In

type QueryParameter = BaseFormatContrainedParameter & BaseSchema & AllowEmptyValue
