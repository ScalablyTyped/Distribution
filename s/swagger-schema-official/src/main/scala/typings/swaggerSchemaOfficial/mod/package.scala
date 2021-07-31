package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BaseFormatContrainedParameter = typings.swaggerSchemaOfficial.mod.BaseParameter & typings.swaggerSchemaOfficial.mod.SchemaFormatConstraints

type FormDataParameter = typings.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter & typings.swaggerSchemaOfficial.mod.BaseSchema & typings.swaggerSchemaOfficial.anon.CollectionFormat

type HeaderParameter = typings.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter & typings.swaggerSchemaOfficial.mod.BaseSchema & typings.swaggerSchemaOfficial.anon.`0`

type OAuthScope = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type Parameter = typings.swaggerSchemaOfficial.mod.BodyParameter | typings.swaggerSchemaOfficial.mod.FormDataParameter | typings.swaggerSchemaOfficial.mod.QueryParameter | typings.swaggerSchemaOfficial.mod.PathParameter | typings.swaggerSchemaOfficial.mod.HeaderParameter

type PathParameter = typings.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter & typings.swaggerSchemaOfficial.mod.BaseSchema & typings.swaggerSchemaOfficial.anon.In

type QueryParameter = typings.swaggerSchemaOfficial.mod.BaseFormatContrainedParameter & typings.swaggerSchemaOfficial.mod.BaseSchema & typings.swaggerSchemaOfficial.anon.AllowEmptyValue
