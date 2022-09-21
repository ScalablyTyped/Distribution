package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import typings.typedGraphql.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def GraphQLBoolean: GraphQLScalarType = ^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLBoolean").asInstanceOf[GraphQLScalarType]
inline def GraphQLBoolean_=(x: GraphQLScalarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLBoolean")(x.asInstanceOf[js.Any])

inline def GraphQLFloat: GraphQLScalarType = ^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLFloat").asInstanceOf[GraphQLScalarType]
inline def GraphQLFloat_=(x: GraphQLScalarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLFloat")(x.asInstanceOf[js.Any])

inline def GraphQLID: GraphQLScalarType = ^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLID").asInstanceOf[GraphQLScalarType]
inline def GraphQLID_=(x: GraphQLScalarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLID")(x.asInstanceOf[js.Any])

inline def GraphQLIncludeDirective: GraphQLDirective = ^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLIncludeDirective").asInstanceOf[GraphQLDirective]
inline def GraphQLIncludeDirective_=(x: GraphQLDirective): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLIncludeDirective")(x.asInstanceOf[js.Any])

inline def GraphQLInt: GraphQLScalarType = ^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLInt").asInstanceOf[GraphQLScalarType]
inline def GraphQLInt_=(x: GraphQLScalarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLInt")(x.asInstanceOf[js.Any])

inline def GraphQLSkipDirective: GraphQLDirective = ^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLSkipDirective").asInstanceOf[GraphQLDirective]
inline def GraphQLSkipDirective_=(x: GraphQLDirective): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLSkipDirective")(x.asInstanceOf[js.Any])

inline def GraphQLString: GraphQLScalarType = ^.asInstanceOf[js.Dynamic].selectDynamic("GraphQLString").asInstanceOf[GraphQLScalarType]
inline def GraphQLString_=(x: GraphQLScalarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GraphQLString")(x.asInstanceOf[js.Any])

inline def buildClientSchema(introspection: IntrospectionQuery_): GraphQLSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClientSchema")(introspection.asInstanceOf[js.Any]).asInstanceOf[GraphQLSchema]

inline def formatError(error: js.Error): GraphQLFormattedError = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[GraphQLFormattedError]

inline def graphql(schema: GraphQLSchema, requestString: String): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(schema: GraphQLSchema, requestString: String, rootValue: Any): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(schema: GraphQLSchema, requestString: String, rootValue: Any, contextValue: Any): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Any,
  contextValue: Any,
  variableValues: StringDictionary[Any]
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Any,
  contextValue: Any,
  variableValues: StringDictionary[Any],
  operationName: String
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Any,
  contextValue: Any,
  variableValues: Unit,
  operationName: String
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Any,
  contextValue: Unit,
  variableValues: StringDictionary[Any]
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Any,
  contextValue: Unit,
  variableValues: StringDictionary[Any],
  operationName: String
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Any,
  contextValue: Unit,
  variableValues: Unit,
  operationName: String
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(schema: GraphQLSchema, requestString: String, rootValue: Unit, contextValue: Any): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Unit,
  contextValue: Any,
  variableValues: StringDictionary[Any]
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Unit,
  contextValue: Any,
  variableValues: StringDictionary[Any],
  operationName: String
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Unit,
  contextValue: Any,
  variableValues: Unit,
  operationName: String
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Unit,
  contextValue: Unit,
  variableValues: StringDictionary[Any]
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Unit,
  contextValue: Unit,
  variableValues: StringDictionary[Any],
  operationName: String
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]
inline def graphql(
  schema: GraphQLSchema,
  requestString: String,
  rootValue: Unit,
  contextValue: Unit,
  variableValues: Unit,
  operationName: String
): js.Promise[GraphQLResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("graphql")(schema.asInstanceOf[js.Any], requestString.asInstanceOf[js.Any], rootValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any], variableValues.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GraphQLResult]]

inline def introspectionQuery: String = ^.asInstanceOf[js.Dynamic].selectDynamic("introspectionQuery").asInstanceOf[String]

inline def specifiedRules: js.Array[ValidationRule] = ^.asInstanceOf[js.Dynamic].selectDynamic("specifiedRules").asInstanceOf[js.Array[ValidationRule]]

inline def validate(schema: GraphQLSchema, ast: Document): js.Array[js.Error] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], ast.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Error]]
inline def validate(schema: GraphQLSchema, ast: Document, rules: js.Array[Any]): js.Array[js.Error] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], ast.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Error]]

type GraphQLEnumValueConfigMap = StringDictionary[GraphQLEnumValueConfig]

// error/*.js
type GraphQLError = js.Error

type GraphQLFieldConfigArgumentMap = StringDictionary[GraphQLArgumentConfig]

type GraphQLFieldConfigMap = StringDictionary[GraphQLFieldConfig]

type GraphQLFieldConfigMapThunk = js.Function0[GraphQLFieldConfigMap]

type GraphQLFieldDefinitionMap = StringDictionary[GraphQLFieldDefinition]

type GraphQLFieldResolveFn = js.Function4[
/* source */ Any, 
/* args */ StringDictionary[Any], 
/* context */ Any, 
/* info */ GraphQLResolveInfo, 
Any]

type GraphQLInterfacesThunk = js.Function0[js.Array[GraphQLInterfaceType]]

type GraphQLIsTypeOfFn = js.Function3[/* source */ Any, /* context */ Any, /* info */ GraphQLResolveInfo, Boolean]

type GraphQLTypeResolveFn = js.Function3[/* value */ Any, /* context */ Any, /* info */ GraphQLResolveInfo, GraphQLObjectType]

type InputObjectConfigFieldMap = StringDictionary[InputObjectFieldConfig]

type InputObjectConfigFieldMapThunk = js.Function0[InputObjectConfigFieldMap]

type InputObjectFieldMap = StringDictionary[InputObjectField]

type Lexer = js.Function1[/* resetPosition */ js.UndefOr[Double], Token]

type TokenKind = StringDictionary[Double]

type TypeKind = StringDictionary[String]

type TypeMap = StringDictionary[GraphQLType]

// validation/*.js
type ValidationRule = js.Function1[/* context */ ValidationContext, Any]
