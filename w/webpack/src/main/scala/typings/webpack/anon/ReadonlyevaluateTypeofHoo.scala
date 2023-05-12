package typings.webpack.anon

import typings.estree.mod.ArrayExpression
import typings.estree.mod.ArrowFunctionExpression
import typings.estree.mod.AssignmentExpression
import typings.estree.mod.AwaitExpression
import typings.estree.mod.BigIntLiteral
import typings.estree.mod.BinaryExpression
import typings.estree.mod.BlockStatement
import typings.estree.mod.BreakStatement
import typings.estree.mod.ChainExpression
import typings.estree.mod.ClassDeclaration
import typings.estree.mod.ClassExpression
import typings.estree.mod.ConditionalExpression
import typings.estree.mod.ContinueStatement
import typings.estree.mod.DebuggerStatement
import typings.estree.mod.DoWhileStatement
import typings.estree.mod.EmptyStatement
import typings.estree.mod.ExportAllDeclaration
import typings.estree.mod.ExportDefaultDeclaration
import typings.estree.mod.ExportNamedDeclaration
import typings.estree.mod.ExpressionStatement
import typings.estree.mod.ForInStatement
import typings.estree.mod.ForOfStatement
import typings.estree.mod.ForStatement
import typings.estree.mod.FunctionDeclaration
import typings.estree.mod.FunctionExpression
import typings.estree.mod.Identifier
import typings.estree.mod.IfStatement
import typings.estree.mod.ImportDeclaration
import typings.estree.mod.ImportExpression
import typings.estree.mod.LabeledStatement
import typings.estree.mod.LogicalExpression
import typings.estree.mod.MemberExpression
import typings.estree.mod.MetaProperty
import typings.estree.mod.MethodDefinition
import typings.estree.mod.NewExpression
import typings.estree.mod.ObjectExpression
import typings.estree.mod.PrivateIdentifier
import typings.estree.mod.Program
import typings.estree.mod.PropertyDefinition
import typings.estree.mod.RegExpLiteral
import typings.estree.mod.ReturnStatement
import typings.estree.mod.SequenceExpression
import typings.estree.mod.SimpleCallExpression
import typings.estree.mod.SimpleLiteral
import typings.estree.mod.StaticBlock
import typings.estree.mod.SwitchStatement
import typings.estree.mod.TaggedTemplateExpression
import typings.estree.mod.TemplateLiteral
import typings.estree.mod.ThisExpression
import typings.estree.mod.ThrowStatement
import typings.estree.mod.TryStatement
import typings.estree.mod.UnaryExpression
import typings.estree.mod.UpdateExpression
import typings.estree.mod.VariableDeclaration
import typings.estree.mod.VariableDeclarator
import typings.estree.mod.WhileStatement
import typings.estree.mod.WithStatement
import typings.estree.mod.YieldExpression
import typings.std.Comment
import typings.tapable.mod.HookMap
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.BasicEvaluatedExpression
import typings.webpack.mod.CallExpression
import typings.webpack.mod.Declaration
import typings.webpack.mod.Expression
import typings.webpack.mod.ImportSource
import typings.webpack.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  evaluateTypeof :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.UnaryExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluate :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateIdentifier :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.Identifier | estree.estree.MemberExpression | estree.estree.MetaProperty | estree.estree.ThisExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateDefinedIdentifier :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.Identifier | estree.estree.MemberExpression | estree.estree.ThisExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateNewExpression :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.NewExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateCallExpression :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.CallExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateCallExpressionMember :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.CallExpression, undefined | webpack.webpack.BasicEvaluatedExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   isPure :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.UnaryExpression | estree.estree.ArrayExpression | estree.estree.ArrowFunctionExpression | estree.estree.AssignmentExpression | estree.estree.AwaitExpression | estree.estree.BinaryExpression | estree.estree.SimpleCallExpression | estree.estree.NewExpression | estree.estree.ChainExpression | estree.estree.ClassExpression | estree.estree.ConditionalExpression | estree.estree.FunctionExpression | estree.estree.Identifier | estree.estree.ImportExpression | estree.estree.SimpleLiteral | estree.estree.RegExpLiteral | estree.estree.BigIntLiteral | estree.estree.LogicalExpression | estree.estree.MemberExpression | estree.estree.MetaProperty | estree.estree.ObjectExpression | estree.estree.SequenceExpression | estree.estree.TaggedTemplateExpression | estree.estree.TemplateLiteral | estree.estree.ThisExpression | estree.estree.UpdateExpression | estree.estree.YieldExpression | estree.estree.FunctionDeclaration | estree.estree.VariableDeclaration | estree.estree.ClassDeclaration | estree.estree.PrivateIdentifier, number], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   preStatement :tapable.tapable.SyncBailHook<[estree.estree.FunctionDeclaration | estree.estree.VariableDeclaration | estree.estree.ClassDeclaration | estree.estree.ExpressionStatement | estree.estree.BlockStatement | estree.estree.StaticBlock | estree.estree.EmptyStatement | estree.estree.DebuggerStatement | estree.estree.WithStatement | estree.estree.ReturnStatement | estree.estree.LabeledStatement | estree.estree.BreakStatement | estree.estree.ContinueStatement | estree.estree.IfStatement | estree.estree.SwitchStatement | estree.estree.ThrowStatement | estree.estree.TryStatement | estree.estree.WhileStatement | estree.estree.DoWhileStatement | estree.estree.ForStatement | estree.estree.ForInStatement | estree.estree.ForOfStatement | estree.estree.ImportDeclaration | estree.estree.ExportNamedDeclaration | estree.estree.ExportDefaultDeclaration | estree.estree.ExportAllDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   blockPreStatement :tapable.tapable.SyncBailHook<[estree.estree.FunctionDeclaration | estree.estree.VariableDeclaration | estree.estree.ClassDeclaration | estree.estree.ExpressionStatement | estree.estree.BlockStatement | estree.estree.StaticBlock | estree.estree.EmptyStatement | estree.estree.DebuggerStatement | estree.estree.WithStatement | estree.estree.ReturnStatement | estree.estree.LabeledStatement | estree.estree.BreakStatement | estree.estree.ContinueStatement | estree.estree.IfStatement | estree.estree.SwitchStatement | estree.estree.ThrowStatement | estree.estree.TryStatement | estree.estree.WhileStatement | estree.estree.DoWhileStatement | estree.estree.ForStatement | estree.estree.ForInStatement | estree.estree.ForOfStatement | estree.estree.ImportDeclaration | estree.estree.ExportNamedDeclaration | estree.estree.ExportDefaultDeclaration | estree.estree.ExportAllDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   statement :tapable.tapable.SyncBailHook<[estree.estree.FunctionDeclaration | estree.estree.VariableDeclaration | estree.estree.ClassDeclaration | estree.estree.ExpressionStatement | estree.estree.BlockStatement | estree.estree.StaticBlock | estree.estree.EmptyStatement | estree.estree.DebuggerStatement | estree.estree.WithStatement | estree.estree.ReturnStatement | estree.estree.LabeledStatement | estree.estree.BreakStatement | estree.estree.ContinueStatement | estree.estree.IfStatement | estree.estree.SwitchStatement | estree.estree.ThrowStatement | estree.estree.TryStatement | estree.estree.WhileStatement | estree.estree.DoWhileStatement | estree.estree.ForStatement | estree.estree.ForInStatement | estree.estree.ForOfStatement | estree.estree.ImportDeclaration | estree.estree.ExportNamedDeclaration | estree.estree.ExportDefaultDeclaration | estree.estree.ExportAllDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   statementIf :tapable.tapable.SyncBailHook<[estree.estree.IfStatement], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   classExtendsExpression :tapable.tapable.SyncBailHook<[webpack.webpack.Expression, estree.estree.ClassExpression | estree.estree.ClassDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   classBodyElement :tapable.tapable.SyncBailHook<[estree.estree.MethodDefinition | estree.estree.PropertyDefinition, estree.estree.ClassExpression | estree.estree.ClassDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   classBodyValue :tapable.tapable.SyncBailHook<[webpack.webpack.Expression, estree.estree.MethodDefinition | estree.estree.PropertyDefinition, estree.estree.ClassExpression | estree.estree.ClassDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   label :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.LabeledStatement], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   import :tapable.tapable.SyncBailHook<[estree.estree.ImportDeclaration, webpack.webpack.ImportSource], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   importSpecifier :tapable.tapable.SyncBailHook<[estree.estree.ImportDeclaration, webpack.webpack.ImportSource, string, string], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   export :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportImport :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration, webpack.webpack.ImportSource], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportDeclaration :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration, webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportExpression :tapable.tapable.SyncBailHook<[estree.estree.ExportDefaultDeclaration, webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportSpecifier :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration, string, string, undefined | number], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportImportSpecifier :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration, webpack.webpack.ImportSource, string, string, undefined | number], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   preDeclarator :tapable.tapable.SyncBailHook<[estree.estree.VariableDeclarator, webpack.webpack.Statement], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   declarator :tapable.tapable.SyncBailHook<[estree.estree.VariableDeclarator, webpack.webpack.Statement], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   varDeclaration :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   varDeclarationLet :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   varDeclarationConst :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   varDeclarationVar :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   pattern :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.Identifier], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   canRename :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   rename :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   assign :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.AssignmentExpression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   assignMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.AssignmentExpression, std.Array<string>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   typeof :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   importCall :tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   topLevelAwait :tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   call :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   callMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.CallExpression, std.Array<string>, std.Array<boolean>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   memberChainOfCallMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression, std.Array<string>, webpack.webpack.CallExpression, std.Array<string>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   callMemberChainOfCallMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression, std.Array<string>, webpack.webpack.CallExpression, std.Array<string>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   optionalChaining :tapable.tapable.SyncBailHook<[estree.estree.ChainExpression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   new :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.NewExpression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   binaryExpression :tapable.tapable.SyncBailHook<[estree.estree.BinaryExpression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   expression :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   expressionMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression, std.Array<string>, std.Array<boolean>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   unhandledExpressionMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression, std.Array<string>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   expressionConditionalOperator :tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   expressionLogicalOperator :tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   program :tapable.tapable.SyncBailHook<[estree.estree.Program, std.Array<std.Comment>], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   finish :tapable.tapable.SyncBailHook<[estree.estree.Program, std.Array<std.Comment>], boolean | void, tapable.tapable.UnsetAdditionalOptions>}> */
trait ReadonlyevaluateTypeofHoo extends StObject {
  
  val assign: HookMap[
    SyncBailHook[js.Array[AssignmentExpression], Boolean | Unit, UnsetAdditionalOptions]
  ]
  
  val assignMemberChain: HookMap[
    SyncBailHook[
      js.Tuple2[AssignmentExpression, js.Array[String]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val binaryExpression: SyncBailHook[js.Array[BinaryExpression], Boolean | Unit, UnsetAdditionalOptions]
  
  val blockPreStatement: SyncBailHook[
    js.Array[
      FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val call: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val callMemberChain: HookMap[
    SyncBailHook[
      js.Tuple3[CallExpression, js.Array[String], js.Array[Boolean]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val callMemberChainOfCallMemberChain: HookMap[
    SyncBailHook[
      js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val canRename: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val classBodyElement: SyncBailHook[
    js.Tuple2[MethodDefinition | PropertyDefinition, ClassExpression | ClassDeclaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val classBodyValue: SyncBailHook[
    js.Tuple3[
      Expression, 
      MethodDefinition | PropertyDefinition, 
      ClassExpression | ClassDeclaration
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val classExtendsExpression: SyncBailHook[
    js.Tuple2[Expression, ClassExpression | ClassDeclaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val declarator: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions]
  
  val evaluate: HookMap[
    SyncBailHook[
      js.Array[Expression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateCallExpression: HookMap[
    SyncBailHook[
      js.Array[CallExpression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateCallExpressionMember: HookMap[
    SyncBailHook[
      js.Tuple2[CallExpression, js.UndefOr[BasicEvaluatedExpression]], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateDefinedIdentifier: HookMap[
    SyncBailHook[
      js.Array[Identifier | MemberExpression | ThisExpression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateIdentifier: HookMap[
    SyncBailHook[
      js.Array[Identifier | MemberExpression | MetaProperty | ThisExpression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateNewExpression: HookMap[
    SyncBailHook[
      js.Array[NewExpression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateTypeof: HookMap[
    SyncBailHook[
      js.Array[UnaryExpression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val `export`: SyncBailHook[
    js.Array[ExportNamedDeclaration | ExportAllDeclaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportDeclaration: SyncBailHook[
    js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, Declaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportExpression: SyncBailHook[
    js.Tuple2[ExportDefaultDeclaration, Declaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportImport: SyncBailHook[
    js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, ImportSource], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportImportSpecifier: SyncBailHook[
    js.Tuple5[
      ExportNamedDeclaration | ExportAllDeclaration, 
      ImportSource, 
      String, 
      String, 
      js.UndefOr[Double]
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportSpecifier: SyncBailHook[
    js.Tuple4[ExportNamedDeclaration | ExportAllDeclaration, String, String, js.UndefOr[Double]], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val expression: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val expressionConditionalOperator: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]
  
  val expressionLogicalOperator: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]
  
  val expressionMemberChain: HookMap[
    SyncBailHook[
      js.Tuple3[Expression, js.Array[String], js.Array[Boolean]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val finish: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions]
  
  val `import`: SyncBailHook[js.Tuple2[ImportDeclaration, ImportSource], Boolean | Unit, UnsetAdditionalOptions]
  
  val importCall: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]
  
  val importSpecifier: SyncBailHook[
    js.Tuple4[ImportDeclaration, ImportSource, String, String], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val isPure: HookMap[
    SyncBailHook[
      js.Tuple2[
        UnaryExpression | ArrayExpression | ArrowFunctionExpression | AssignmentExpression | AwaitExpression | BinaryExpression | SimpleCallExpression | NewExpression | ChainExpression | ClassExpression | ConditionalExpression | FunctionExpression | Identifier | ImportExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | LogicalExpression | MemberExpression | MetaProperty | ObjectExpression | SequenceExpression | TaggedTemplateExpression | TemplateLiteral | ThisExpression | UpdateExpression | YieldExpression | FunctionDeclaration | VariableDeclaration | ClassDeclaration | PrivateIdentifier, 
        Double
      ], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val label: HookMap[SyncBailHook[js.Array[LabeledStatement], Boolean | Unit, UnsetAdditionalOptions]]
  
  val memberChainOfCallMemberChain: HookMap[
    SyncBailHook[
      js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val `new`: HookMap[SyncBailHook[js.Array[NewExpression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val optionalChaining: SyncBailHook[js.Array[ChainExpression], Boolean | Unit, UnsetAdditionalOptions]
  
  val pattern: HookMap[SyncBailHook[js.Array[Identifier], Boolean | Unit, UnsetAdditionalOptions]]
  
  val preDeclarator: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions]
  
  val preStatement: SyncBailHook[
    js.Array[
      FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val program: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions]
  
  val rename: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val statement: SyncBailHook[
    js.Array[
      FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val statementIf: SyncBailHook[js.Array[IfStatement], Boolean | Unit, UnsetAdditionalOptions]
  
  val topLevelAwait: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]
  
  val typeof: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val unhandledExpressionMemberChain: HookMap[
    SyncBailHook[js.Tuple2[Expression, js.Array[String]], Boolean | Unit, UnsetAdditionalOptions]
  ]
  
  val varDeclaration: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
  
  val varDeclarationConst: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
  
  val varDeclarationLet: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
  
  val varDeclarationVar: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
}
object ReadonlyevaluateTypeofHoo {
  
  inline def apply(
    assign: HookMap[
      SyncBailHook[js.Array[AssignmentExpression], Boolean | Unit, UnsetAdditionalOptions]
    ],
    assignMemberChain: HookMap[
      SyncBailHook[
        js.Tuple2[AssignmentExpression, js.Array[String]], 
        Boolean | Unit, 
        UnsetAdditionalOptions
      ]
    ],
    binaryExpression: SyncBailHook[js.Array[BinaryExpression], Boolean | Unit, UnsetAdditionalOptions],
    blockPreStatement: SyncBailHook[
      js.Array[
        FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
      ], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    call: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]],
    callMemberChain: HookMap[
      SyncBailHook[
        js.Tuple3[CallExpression, js.Array[String], js.Array[Boolean]], 
        Boolean | Unit, 
        UnsetAdditionalOptions
      ]
    ],
    callMemberChainOfCallMemberChain: HookMap[
      SyncBailHook[
        js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
        Boolean | Unit, 
        UnsetAdditionalOptions
      ]
    ],
    canRename: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]],
    classBodyElement: SyncBailHook[
      js.Tuple2[MethodDefinition | PropertyDefinition, ClassExpression | ClassDeclaration], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    classBodyValue: SyncBailHook[
      js.Tuple3[
        Expression, 
        MethodDefinition | PropertyDefinition, 
        ClassExpression | ClassDeclaration
      ], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    classExtendsExpression: SyncBailHook[
      js.Tuple2[Expression, ClassExpression | ClassDeclaration], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    declarator: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions],
    evaluate: HookMap[
      SyncBailHook[
        js.Array[Expression], 
        js.UndefOr[Null | BasicEvaluatedExpression], 
        UnsetAdditionalOptions
      ]
    ],
    evaluateCallExpression: HookMap[
      SyncBailHook[
        js.Array[CallExpression], 
        js.UndefOr[Null | BasicEvaluatedExpression], 
        UnsetAdditionalOptions
      ]
    ],
    evaluateCallExpressionMember: HookMap[
      SyncBailHook[
        js.Tuple2[CallExpression, js.UndefOr[BasicEvaluatedExpression]], 
        js.UndefOr[Null | BasicEvaluatedExpression], 
        UnsetAdditionalOptions
      ]
    ],
    evaluateDefinedIdentifier: HookMap[
      SyncBailHook[
        js.Array[Identifier | MemberExpression | ThisExpression], 
        js.UndefOr[Null | BasicEvaluatedExpression], 
        UnsetAdditionalOptions
      ]
    ],
    evaluateIdentifier: HookMap[
      SyncBailHook[
        js.Array[Identifier | MemberExpression | MetaProperty | ThisExpression], 
        js.UndefOr[Null | BasicEvaluatedExpression], 
        UnsetAdditionalOptions
      ]
    ],
    evaluateNewExpression: HookMap[
      SyncBailHook[
        js.Array[NewExpression], 
        js.UndefOr[Null | BasicEvaluatedExpression], 
        UnsetAdditionalOptions
      ]
    ],
    evaluateTypeof: HookMap[
      SyncBailHook[
        js.Array[UnaryExpression], 
        js.UndefOr[Null | BasicEvaluatedExpression], 
        UnsetAdditionalOptions
      ]
    ],
    `export`: SyncBailHook[
      js.Array[ExportNamedDeclaration | ExportAllDeclaration], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    exportDeclaration: SyncBailHook[
      js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, Declaration], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    exportExpression: SyncBailHook[
      js.Tuple2[ExportDefaultDeclaration, Declaration], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    exportImport: SyncBailHook[
      js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, ImportSource], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    exportImportSpecifier: SyncBailHook[
      js.Tuple5[
        ExportNamedDeclaration | ExportAllDeclaration, 
        ImportSource, 
        String, 
        String, 
        js.UndefOr[Double]
      ], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    exportSpecifier: SyncBailHook[
      js.Tuple4[ExportNamedDeclaration | ExportAllDeclaration, String, String, js.UndefOr[Double]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    expression: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]],
    expressionConditionalOperator: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions],
    expressionLogicalOperator: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions],
    expressionMemberChain: HookMap[
      SyncBailHook[
        js.Tuple3[Expression, js.Array[String], js.Array[Boolean]], 
        Boolean | Unit, 
        UnsetAdditionalOptions
      ]
    ],
    finish: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions],
    `import`: SyncBailHook[js.Tuple2[ImportDeclaration, ImportSource], Boolean | Unit, UnsetAdditionalOptions],
    importCall: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions],
    importSpecifier: SyncBailHook[
      js.Tuple4[ImportDeclaration, ImportSource, String, String], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    isPure: HookMap[
      SyncBailHook[
        js.Tuple2[
          UnaryExpression | ArrayExpression | ArrowFunctionExpression | AssignmentExpression | AwaitExpression | BinaryExpression | SimpleCallExpression | NewExpression | ChainExpression | ClassExpression | ConditionalExpression | FunctionExpression | Identifier | ImportExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | LogicalExpression | MemberExpression | MetaProperty | ObjectExpression | SequenceExpression | TaggedTemplateExpression | TemplateLiteral | ThisExpression | UpdateExpression | YieldExpression | FunctionDeclaration | VariableDeclaration | ClassDeclaration | PrivateIdentifier, 
          Double
        ], 
        Boolean | Unit, 
        UnsetAdditionalOptions
      ]
    ],
    label: HookMap[SyncBailHook[js.Array[LabeledStatement], Boolean | Unit, UnsetAdditionalOptions]],
    memberChainOfCallMemberChain: HookMap[
      SyncBailHook[
        js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
        Boolean | Unit, 
        UnsetAdditionalOptions
      ]
    ],
    `new`: HookMap[SyncBailHook[js.Array[NewExpression], Boolean | Unit, UnsetAdditionalOptions]],
    optionalChaining: SyncBailHook[js.Array[ChainExpression], Boolean | Unit, UnsetAdditionalOptions],
    pattern: HookMap[SyncBailHook[js.Array[Identifier], Boolean | Unit, UnsetAdditionalOptions]],
    preDeclarator: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions],
    preStatement: SyncBailHook[
      js.Array[
        FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
      ], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    program: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions],
    rename: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]],
    statement: SyncBailHook[
      js.Array[
        FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
      ], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ],
    statementIf: SyncBailHook[js.Array[IfStatement], Boolean | Unit, UnsetAdditionalOptions],
    topLevelAwait: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions],
    typeof: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]],
    unhandledExpressionMemberChain: HookMap[
      SyncBailHook[js.Tuple2[Expression, js.Array[String]], Boolean | Unit, UnsetAdditionalOptions]
    ],
    varDeclaration: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]],
    varDeclarationConst: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]],
    varDeclarationLet: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]],
    varDeclarationVar: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
  ): ReadonlyevaluateTypeofHoo = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], assignMemberChain = assignMemberChain.asInstanceOf[js.Any], binaryExpression = binaryExpression.asInstanceOf[js.Any], blockPreStatement = blockPreStatement.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], callMemberChain = callMemberChain.asInstanceOf[js.Any], callMemberChainOfCallMemberChain = callMemberChainOfCallMemberChain.asInstanceOf[js.Any], canRename = canRename.asInstanceOf[js.Any], classBodyElement = classBodyElement.asInstanceOf[js.Any], classBodyValue = classBodyValue.asInstanceOf[js.Any], classExtendsExpression = classExtendsExpression.asInstanceOf[js.Any], declarator = declarator.asInstanceOf[js.Any], evaluate = evaluate.asInstanceOf[js.Any], evaluateCallExpression = evaluateCallExpression.asInstanceOf[js.Any], evaluateCallExpressionMember = evaluateCallExpressionMember.asInstanceOf[js.Any], evaluateDefinedIdentifier = evaluateDefinedIdentifier.asInstanceOf[js.Any], evaluateIdentifier = evaluateIdentifier.asInstanceOf[js.Any], evaluateNewExpression = evaluateNewExpression.asInstanceOf[js.Any], evaluateTypeof = evaluateTypeof.asInstanceOf[js.Any], exportDeclaration = exportDeclaration.asInstanceOf[js.Any], exportExpression = exportExpression.asInstanceOf[js.Any], exportImport = exportImport.asInstanceOf[js.Any], exportImportSpecifier = exportImportSpecifier.asInstanceOf[js.Any], exportSpecifier = exportSpecifier.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], expressionConditionalOperator = expressionConditionalOperator.asInstanceOf[js.Any], expressionLogicalOperator = expressionLogicalOperator.asInstanceOf[js.Any], expressionMemberChain = expressionMemberChain.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], importCall = importCall.asInstanceOf[js.Any], importSpecifier = importSpecifier.asInstanceOf[js.Any], isPure = isPure.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], memberChainOfCallMemberChain = memberChainOfCallMemberChain.asInstanceOf[js.Any], optionalChaining = optionalChaining.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], preDeclarator = preDeclarator.asInstanceOf[js.Any], preStatement = preStatement.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], statementIf = statementIf.asInstanceOf[js.Any], topLevelAwait = topLevelAwait.asInstanceOf[js.Any], typeof = typeof.asInstanceOf[js.Any], unhandledExpressionMemberChain = unhandledExpressionMemberChain.asInstanceOf[js.Any], varDeclaration = varDeclaration.asInstanceOf[js.Any], varDeclarationConst = varDeclarationConst.asInstanceOf[js.Any], varDeclarationLet = varDeclarationLet.asInstanceOf[js.Any], varDeclarationVar = varDeclarationVar.asInstanceOf[js.Any])
    __obj.updateDynamic("export")(`export`.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyevaluateTypeofHoo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyevaluateTypeofHoo] (val x: Self) extends AnyVal {
    
    inline def setAssign(
      value: HookMap[
          SyncBailHook[js.Array[AssignmentExpression], Boolean | Unit, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setAssignMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[AssignmentExpression, js.Array[String]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "assignMemberChain", value.asInstanceOf[js.Any])
    
    inline def setBinaryExpression(value: SyncBailHook[js.Array[BinaryExpression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "binaryExpression", value.asInstanceOf[js.Any])
    
    inline def setBlockPreStatement(
      value: SyncBailHook[
          js.Array[
            FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "blockPreStatement", value.asInstanceOf[js.Any])
    
    inline def setCall(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCallMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple3[CallExpression, js.Array[String], js.Array[Boolean]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "callMemberChain", value.asInstanceOf[js.Any])
    
    inline def setCallMemberChainOfCallMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "callMemberChainOfCallMemberChain", value.asInstanceOf[js.Any])
    
    inline def setCanRename(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    inline def setClassBodyElement(
      value: SyncBailHook[
          js.Tuple2[MethodDefinition | PropertyDefinition, ClassExpression | ClassDeclaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "classBodyElement", value.asInstanceOf[js.Any])
    
    inline def setClassBodyValue(
      value: SyncBailHook[
          js.Tuple3[
            Expression, 
            MethodDefinition | PropertyDefinition, 
            ClassExpression | ClassDeclaration
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "classBodyValue", value.asInstanceOf[js.Any])
    
    inline def setClassExtendsExpression(
      value: SyncBailHook[
          js.Tuple2[Expression, ClassExpression | ClassDeclaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "classExtendsExpression", value.asInstanceOf[js.Any])
    
    inline def setDeclarator(
      value: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "declarator", value.asInstanceOf[js.Any])
    
    inline def setEvaluate(
      value: HookMap[
          SyncBailHook[
            js.Array[Expression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
    
    inline def setEvaluateCallExpression(
      value: HookMap[
          SyncBailHook[
            js.Array[CallExpression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateCallExpression", value.asInstanceOf[js.Any])
    
    inline def setEvaluateCallExpressionMember(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[CallExpression, js.UndefOr[BasicEvaluatedExpression]], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateCallExpressionMember", value.asInstanceOf[js.Any])
    
    inline def setEvaluateDefinedIdentifier(
      value: HookMap[
          SyncBailHook[
            js.Array[Identifier | MemberExpression | ThisExpression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateDefinedIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluateIdentifier(
      value: HookMap[
          SyncBailHook[
            js.Array[Identifier | MemberExpression | MetaProperty | ThisExpression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluateNewExpression(
      value: HookMap[
          SyncBailHook[
            js.Array[NewExpression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateNewExpression", value.asInstanceOf[js.Any])
    
    inline def setEvaluateTypeof(
      value: HookMap[
          SyncBailHook[
            js.Array[UnaryExpression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateTypeof", value.asInstanceOf[js.Any])
    
    inline def setExport(
      value: SyncBailHook[
          js.Array[ExportNamedDeclaration | ExportAllDeclaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportDeclaration(
      value: SyncBailHook[
          js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, Declaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportDeclaration", value.asInstanceOf[js.Any])
    
    inline def setExportExpression(
      value: SyncBailHook[
          js.Tuple2[ExportDefaultDeclaration, Declaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportExpression", value.asInstanceOf[js.Any])
    
    inline def setExportImport(
      value: SyncBailHook[
          js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, ImportSource], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportImport", value.asInstanceOf[js.Any])
    
    inline def setExportImportSpecifier(
      value: SyncBailHook[
          js.Tuple5[
            ExportNamedDeclaration | ExportAllDeclaration, 
            ImportSource, 
            String, 
            String, 
            js.UndefOr[Double]
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportImportSpecifier", value.asInstanceOf[js.Any])
    
    inline def setExportSpecifier(
      value: SyncBailHook[
          js.Tuple4[ExportNamedDeclaration | ExportAllDeclaration, String, String, js.UndefOr[Double]], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportSpecifier", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionConditionalOperator(value: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "expressionConditionalOperator", value.asInstanceOf[js.Any])
    
    inline def setExpressionLogicalOperator(value: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "expressionLogicalOperator", value.asInstanceOf[js.Any])
    
    inline def setExpressionMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple3[Expression, js.Array[String], js.Array[Boolean]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "expressionMemberChain", value.asInstanceOf[js.Any])
    
    inline def setFinish(value: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
    
    inline def setImport(
      value: SyncBailHook[js.Tuple2[ImportDeclaration, ImportSource], Boolean | Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportCall(value: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "importCall", value.asInstanceOf[js.Any])
    
    inline def setImportSpecifier(
      value: SyncBailHook[
          js.Tuple4[ImportDeclaration, ImportSource, String, String], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "importSpecifier", value.asInstanceOf[js.Any])
    
    inline def setIsPure(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[
              UnaryExpression | ArrayExpression | ArrowFunctionExpression | AssignmentExpression | AwaitExpression | BinaryExpression | SimpleCallExpression | NewExpression | ChainExpression | ClassExpression | ConditionalExpression | FunctionExpression | Identifier | ImportExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | LogicalExpression | MemberExpression | MetaProperty | ObjectExpression | SequenceExpression | TaggedTemplateExpression | TemplateLiteral | ThisExpression | UpdateExpression | YieldExpression | FunctionDeclaration | VariableDeclaration | ClassDeclaration | PrivateIdentifier, 
              Double
            ], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "isPure", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: HookMap[SyncBailHook[js.Array[LabeledStatement], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMemberChainOfCallMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "memberChainOfCallMemberChain", value.asInstanceOf[js.Any])
    
    inline def setNew(value: HookMap[SyncBailHook[js.Array[NewExpression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setOptionalChaining(value: SyncBailHook[js.Array[ChainExpression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "optionalChaining", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: HookMap[SyncBailHook[js.Array[Identifier], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPreDeclarator(
      value: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "preDeclarator", value.asInstanceOf[js.Any])
    
    inline def setPreStatement(
      value: SyncBailHook[
          js.Array[
            FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "preStatement", value.asInstanceOf[js.Any])
    
    inline def setProgram(value: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setRename(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setStatement(
      value: SyncBailHook[
          js.Array[
            FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setStatementIf(value: SyncBailHook[js.Array[IfStatement], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "statementIf", value.asInstanceOf[js.Any])
    
    inline def setTopLevelAwait(value: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "topLevelAwait", value.asInstanceOf[js.Any])
    
    inline def setTypeof(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setUnhandledExpressionMemberChain(
      value: HookMap[
          SyncBailHook[js.Tuple2[Expression, js.Array[String]], Boolean | Unit, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "unhandledExpressionMemberChain", value.asInstanceOf[js.Any])
    
    inline def setVarDeclaration(value: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "varDeclaration", value.asInstanceOf[js.Any])
    
    inline def setVarDeclarationConst(value: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "varDeclarationConst", value.asInstanceOf[js.Any])
    
    inline def setVarDeclarationLet(value: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "varDeclarationLet", value.asInstanceOf[js.Any])
    
    inline def setVarDeclarationVar(value: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "varDeclarationVar", value.asInstanceOf[js.Any])
  }
}
