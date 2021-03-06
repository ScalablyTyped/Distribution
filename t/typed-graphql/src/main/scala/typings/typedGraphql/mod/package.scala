package typings.typedGraphql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def GraphQLBoolean: typings.typedGraphql.mod.GraphQLScalarType = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLBoolean").asInstanceOf[typings.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLBoolean_=(x: typings.typedGraphql.mod.GraphQLScalarType): scala.Unit = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLBoolean")(x.asInstanceOf[js.Any])
  
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[typings.typedGraphql.mod.GraphQLEnumValueConfig]
  
  // error/*.js
  type GraphQLError = typings.std.Error
  
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[typings.typedGraphql.mod.GraphQLArgumentConfig]
  
  type GraphQLFieldConfigMap = org.scalablytyped.runtime.StringDictionary[typings.typedGraphql.mod.GraphQLFieldConfig]
  
  type GraphQLFieldConfigMapThunk = js.Function0[typings.typedGraphql.mod.GraphQLFieldConfigMap]
  
  type GraphQLFieldDefinitionMap = org.scalablytyped.runtime.StringDictionary[typings.typedGraphql.mod.GraphQLFieldDefinition]
  
  type GraphQLFieldResolveFn = js.Function4[
    /* source */ js.Any, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ js.Any, 
    /* info */ typings.typedGraphql.mod.GraphQLResolveInfo, 
    js.Any
  ]
  
  @scala.inline
  def GraphQLFloat: typings.typedGraphql.mod.GraphQLScalarType = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLFloat").asInstanceOf[typings.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLFloat_=(x: typings.typedGraphql.mod.GraphQLScalarType): scala.Unit = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLFloat")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def GraphQLID: typings.typedGraphql.mod.GraphQLScalarType = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLID").asInstanceOf[typings.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLID_=(x: typings.typedGraphql.mod.GraphQLScalarType): scala.Unit = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLID")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def GraphQLIncludeDirective: typings.typedGraphql.mod.GraphQLDirective = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLIncludeDirective").asInstanceOf[typings.typedGraphql.mod.GraphQLDirective]
  @scala.inline
  def GraphQLIncludeDirective_=(x: typings.typedGraphql.mod.GraphQLDirective): scala.Unit = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLIncludeDirective")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def GraphQLInt: typings.typedGraphql.mod.GraphQLScalarType = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLInt").asInstanceOf[typings.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLInt_=(x: typings.typedGraphql.mod.GraphQLScalarType): scala.Unit = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLInt")(x.asInstanceOf[js.Any])
  
  type GraphQLInterfacesThunk = js.Function0[js.Array[typings.typedGraphql.mod.GraphQLInterfaceType]]
  
  type GraphQLIsTypeOfFn = js.Function3[
    /* source */ js.Any, 
    /* context */ js.Any, 
    /* info */ typings.typedGraphql.mod.GraphQLResolveInfo, 
    scala.Boolean
  ]
  
  @scala.inline
  def GraphQLSkipDirective: typings.typedGraphql.mod.GraphQLDirective = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLSkipDirective").asInstanceOf[typings.typedGraphql.mod.GraphQLDirective]
  @scala.inline
  def GraphQLSkipDirective_=(x: typings.typedGraphql.mod.GraphQLDirective): scala.Unit = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLSkipDirective")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def GraphQLString: typings.typedGraphql.mod.GraphQLScalarType = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLString").asInstanceOf[typings.typedGraphql.mod.GraphQLScalarType]
  @scala.inline
  def GraphQLString_=(x: typings.typedGraphql.mod.GraphQLScalarType): scala.Unit = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLString")(x.asInstanceOf[js.Any])
  
  type GraphQLTypeResolveFn = js.Function3[
    /* value */ js.Any, 
    /* context */ js.Any, 
    /* info */ typings.typedGraphql.mod.GraphQLResolveInfo, 
    typings.typedGraphql.mod.GraphQLObjectType
  ]
  
  type InputObjectConfigFieldMap = org.scalablytyped.runtime.StringDictionary[typings.typedGraphql.mod.InputObjectFieldConfig]
  
  type InputObjectConfigFieldMapThunk = js.Function0[typings.typedGraphql.mod.InputObjectConfigFieldMap]
  
  type InputObjectFieldMap = org.scalablytyped.runtime.StringDictionary[typings.typedGraphql.mod.InputObjectField]
  
  type Lexer = js.Function1[/* resetPosition */ js.UndefOr[scala.Double], typings.typedGraphql.mod.Token]
  
  type TokenKind = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type TypeKind = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type TypeMap = org.scalablytyped.runtime.StringDictionary[typings.typedGraphql.mod.GraphQLType]
  
  // validation/*.js
  type ValidationRule = js.Function1[/* context */ typings.typedGraphql.mod.ValidationContext, js.Any]
  
  @scala.inline
  def buildClientSchema(introspection: typings.typedGraphql.mod.IntrospectionQuery_): typings.typedGraphql.mod.GraphQLSchema = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildClientSchema")(introspection.asInstanceOf[js.Any]).asInstanceOf[typings.typedGraphql.mod.GraphQLSchema]
  
  @scala.inline
  def formatError(error: typings.typedGraphql.mod.GraphQLError): typings.typedGraphql.mod.GraphQLFormattedError = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[typings.typedGraphql.mod.GraphQLFormattedError]
  
  @scala.inline
  def graphql(schema: typings.typedGraphql.mod.GraphQLSchema, requestString: java.lang.String): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: js.UndefOr[scala.Nothing],
    operationName: java.lang.String
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.Any
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.Any,
    variableValues: js.UndefOr[scala.Nothing],
    operationName: java.lang.String
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.UndefOr[scala.Nothing],
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(schema: typings.typedGraphql.mod.GraphQLSchema, requestString: java.lang.String, rootValue: js.Any): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: js.UndefOr[scala.Nothing],
    operationName: java.lang.String
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.UndefOr[scala.Nothing],
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: js.UndefOr[scala.Nothing],
    operationName: java.lang.String
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  @scala.inline
  def graphql(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typings.typedGraphql.mod.GraphQLResult] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typedGraphql.mod.GraphQLResult]]
  
  @scala.inline
  def introspectionQuery: java.lang.String = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("introspectionQuery").asInstanceOf[java.lang.String]
  
  @scala.inline
  def specifiedRules: js.Array[typings.typedGraphql.mod.ValidationRule] = typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].selectDynamic("specifiedRules").asInstanceOf[js.Array[typings.typedGraphql.mod.ValidationRule]]
  
  @scala.inline
  def validate(schema: typings.typedGraphql.mod.GraphQLSchema, ast: typings.typedGraphql.mod.Document): js.Array[typings.typedGraphql.mod.GraphQLError] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], ast.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typedGraphql.mod.GraphQLError]]
  @scala.inline
  def validate(
    schema: typings.typedGraphql.mod.GraphQLSchema,
    ast: typings.typedGraphql.mod.Document,
    rules: js.Array[_]
  ): js.Array[typings.typedGraphql.mod.GraphQLError] = (typings.typedGraphql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], ast.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typedGraphql.mod.GraphQLError]]
}
