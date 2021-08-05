package typings.typeorm

import typings.typeorm.databaseTypeMod.DatabaseType
import typings.typeorm.findOperatorTypeMod.FindOperatorType
import typings.typeorm.isolationLevelMod.IsolationLevel
import typings.typeorm.onDeleteTypeMod.OnDeleteType
import typings.typeorm.onUpdateTypeMod.OnUpdateType
import typings.typeorm.replicationModeMod.ReplicationMode
import typings.typeorm.selectQueryBuilderOptionMod.SelectQueryBuilderOption
import typings.typeorm.typesColumnModeMod.ColumnMode
import typings.typeorm.typesColumnTypesMod.PrimaryGeneratedColumnType
import typings.typeorm.typesColumnTypesMod.SimpleColumnType
import typings.typeorm.typesColumnTypesMod.SpatialColumnType
import typings.typeorm.typesColumnTypesMod.WithLengthColumnType
import typings.typeorm.typesColumnTypesMod.WithPrecisionColumnType
import typings.typeorm.typesColumnTypesMod.WithWidthColumnType
import typings.typeorm.typesDeferrableTypeMod.DeferrableType
import typings.typeorm.typesEventListenerTypesMod.EventListenerType
import typings.typeorm.typesRelationTypesMod.RelationType
import typings.typeorm.typesTableTypesMod.TableType
import typings.typeorm.typesTreeTypesMod.TreeType
import typings.typeorm.typingsMod.ReadConcernLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeormStrings {
  
  @js.native
  sealed trait ASC extends StObject
  inline def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait CASCADE
    extends StObject
       with OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  inline def CASCADE: CASCADE = "CASCADE".asInstanceOf[CASCADE]
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  inline def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait DESC extends StObject
  inline def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait DeepPartial extends StObject
  inline def DeepPartial: DeepPartial = "DeepPartial".asInstanceOf[DeepPartial]
  
  @js.native
  sealed trait EntitySchemaOptions extends StObject
  inline def EntitySchemaOptions: EntitySchemaOptions = "EntitySchemaOptions".asInstanceOf[EntitySchemaOptions]
  
  @js.native
  sealed trait FilterQuery extends StObject
  inline def FilterQuery: FilterQuery = "FilterQuery".asInstanceOf[FilterQuery]
  
  @js.native
  sealed trait FindConditions extends StObject
  inline def FindConditions: FindConditions = "FindConditions".asInstanceOf[FindConditions]
  
  @js.native
  sealed trait FindOneOptions extends StObject
  inline def FindOneOptions: FindOneOptions = "FindOneOptions".asInstanceOf[FindOneOptions]
  
  @js.native
  sealed trait `INITIALLY DEFERRED`
    extends StObject
       with DeferrableType
       with typings.typeorm.deferrableTypeMod.DeferrableType
  inline def `INITIALLY DEFERRED`: `INITIALLY DEFERRED` = ("INITIALLY DEFERRED").asInstanceOf[`INITIALLY DEFERRED`]
  
  @js.native
  sealed trait `INITIALLY IMMEDIATE`
    extends StObject
       with DeferrableType
       with typings.typeorm.deferrableTypeMod.DeferrableType
  inline def `INITIALLY IMMEDIATE`: `INITIALLY IMMEDIATE` = ("INITIALLY IMMEDIATE").asInstanceOf[`INITIALLY IMMEDIATE`]
  
  @js.native
  sealed trait INNER extends StObject
  inline def INNER: INNER = "INNER".asInstanceOf[INNER]
  
  @js.native
  sealed trait LEFT extends StObject
  inline def LEFT: LEFT = "LEFT".asInstanceOf[LEFT]
  
  @js.native
  sealed trait `NO ACTION`
    extends StObject
       with OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  inline def `NO ACTION`: `NO ACTION` = ("NO ACTION").asInstanceOf[`NO ACTION`]
  
  @js.native
  sealed trait `NULLS FIRST` extends StObject
  inline def `NULLS FIRST`: `NULLS FIRST` = ("NULLS FIRST").asInstanceOf[`NULLS FIRST`]
  
  @js.native
  sealed trait `NULLS LAST` extends StObject
  inline def `NULLS LAST`: `NULLS LAST` = ("NULLS LAST").asInstanceOf[`NULLS LAST`]
  
  @js.native
  sealed trait ORDER extends StObject
  inline def ORDER: ORDER = "ORDER".asInstanceOf[ORDER]
  
  @js.native
  sealed trait QueryDeepPartialEntity extends StObject
  inline def QueryDeepPartialEntity: QueryDeepPartialEntity = "QueryDeepPartialEntity".asInstanceOf[QueryDeepPartialEntity]
  
  @js.native
  sealed trait QueryPartialEntity extends StObject
  inline def QueryPartialEntity: QueryPartialEntity = "QueryPartialEntity".asInstanceOf[QueryPartialEntity]
  
  @js.native
  sealed trait RANDOM extends StObject
  inline def RANDOM: RANDOM = "RANDOM".asInstanceOf[RANDOM]
  
  @js.native
  sealed trait `READ COMMITTED`
    extends StObject
       with IsolationLevel
       with typings.typeorm.typesIsolationLevelMod.IsolationLevel
  inline def `READ COMMITTED`: `READ COMMITTED` = ("READ COMMITTED").asInstanceOf[`READ COMMITTED`]
  
  @js.native
  sealed trait `READ UNCOMMITTED`
    extends StObject
       with IsolationLevel
       with typings.typeorm.typesIsolationLevelMod.IsolationLevel
  inline def `READ UNCOMMITTED`: `READ UNCOMMITTED` = ("READ UNCOMMITTED").asInstanceOf[`READ UNCOMMITTED`]
  
  @js.native
  sealed trait READ_COMMITTED extends StObject
  inline def READ_COMMITTED: READ_COMMITTED = "READ_COMMITTED".asInstanceOf[READ_COMMITTED]
  
  @js.native
  sealed trait READ_UNCOMMITTED extends StObject
  inline def READ_UNCOMMITTED: READ_UNCOMMITTED = "READ_UNCOMMITTED".asInstanceOf[READ_UNCOMMITTED]
  
  @js.native
  sealed trait `REPEATABLE READ`
    extends StObject
       with IsolationLevel
       with typings.typeorm.typesIsolationLevelMod.IsolationLevel
  inline def `REPEATABLE READ`: `REPEATABLE READ` = ("REPEATABLE READ").asInstanceOf[`REPEATABLE READ`]
  
  @js.native
  sealed trait REPEATABLE_READ extends StObject
  inline def REPEATABLE_READ: REPEATABLE_READ = "REPEATABLE_READ".asInstanceOf[REPEATABLE_READ]
  
  @js.native
  sealed trait RESTRICT
    extends StObject
       with OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  inline def RESTRICT: RESTRICT = "RESTRICT".asInstanceOf[RESTRICT]
  
  @js.native
  sealed trait RR extends StObject
  inline def RR: RR = "RR".asInstanceOf[RR]
  
  @js.native
  sealed trait SERIALIZABLE
    extends StObject
       with IsolationLevel
       with typings.typeorm.typesIsolationLevelMod.IsolationLevel
  inline def SERIALIZABLE: SERIALIZABLE = "SERIALIZABLE".asInstanceOf[SERIALIZABLE]
  
  @js.native
  sealed trait `SET NULL`
    extends StObject
       with OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  inline def `SET NULL`: `SET NULL` = ("SET NULL").asInstanceOf[`SET NULL`]
  
  @js.native
  sealed trait SNAPSHOT extends StObject
  inline def SNAPSHOT: SNAPSHOT = "SNAPSHOT".asInstanceOf[SNAPSHOT]
  
  @js.native
  sealed trait STI extends StObject
  inline def STI: STI = "STI".asInstanceOf[STI]
  
  @js.native
  sealed trait STORED extends StObject
  inline def STORED: STORED = "STORED".asInstanceOf[STORED]
  
  @js.native
  sealed trait UpdateQuery extends StObject
  inline def UpdateQuery: UpdateQuery = "UpdateQuery".asInstanceOf[UpdateQuery]
  
  @js.native
  sealed trait VIRTUAL extends StObject
  inline def VIRTUAL: VIRTUAL = "VIRTUAL".asInstanceOf[VIRTUAL]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `adjacency-list`
    extends StObject
       with TreeType
       with typings.typeorm.treeTypesMod.TreeType
  inline def `adjacency-list`: `adjacency-list` = "adjacency-list".asInstanceOf[`adjacency-list`]
  
  @js.native
  sealed trait `advanced-console` extends StObject
  inline def `advanced-console`: `advanced-console` = "advanced-console".asInstanceOf[`advanced-console`]
  
  @js.native
  sealed trait `after-insert`
    extends StObject
       with EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  inline def `after-insert`: `after-insert` = "after-insert".asInstanceOf[`after-insert`]
  
  @js.native
  sealed trait `after-load`
    extends StObject
       with EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  inline def `after-load`: `after-load` = "after-load".asInstanceOf[`after-load`]
  
  @js.native
  sealed trait `after-remove`
    extends StObject
       with EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  inline def `after-remove`: `after-remove` = "after-remove".asInstanceOf[`after-remove`]
  
  @js.native
  sealed trait `after-update`
    extends StObject
       with EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  inline def `after-update`: `after-update` = "after-update".asInstanceOf[`after-update`]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait alphanum
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def alphanum: alphanum = "alphanum".asInstanceOf[alphanum]
  
  @js.native
  sealed trait ancestor extends StObject
  inline def ancestor: ancestor = "ancestor".asInstanceOf[ancestor]
  
  @js.native
  sealed trait and extends StObject
  inline def and: and = "and".asInstanceOf[and]
  
  @js.native
  sealed trait any
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait array
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait `aurora-data-api`
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def `aurora-data-api`: `aurora-data-api` = "aurora-data-api".asInstanceOf[`aurora-data-api`]
  
  @js.native
  sealed trait `aurora-data-api-pg`
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def `aurora-data-api-pg`: `aurora-data-api-pg` = "aurora-data-api-pg".asInstanceOf[`aurora-data-api-pg`]
  
  @js.native
  sealed trait available
    extends StObject
       with ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  inline def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait `before-insert`
    extends StObject
       with EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  inline def `before-insert`: `before-insert` = "before-insert".asInstanceOf[`before-insert`]
  
  @js.native
  sealed trait `before-remove`
    extends StObject
       with EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  inline def `before-remove`: `before-remove` = "before-remove".asInstanceOf[`before-remove`]
  
  @js.native
  sealed trait `before-update`
    extends StObject
       with EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  inline def `before-update`: `before-update` = "before-update".asInstanceOf[`before-update`]
  
  @js.native
  sealed trait `better-sqlite3`
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def `better-sqlite3`: `better-sqlite3` = "better-sqlite3".asInstanceOf[`better-sqlite3`]
  
  @js.native
  sealed trait between
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def between: between = "between".asInstanceOf[between]
  
  @js.native
  sealed trait bfile
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def bfile: bfile = "bfile".asInstanceOf[bfile]
  
  @js.native
  sealed trait bigint
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithWidthColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  inline def bigint: bigint = "bigint".asInstanceOf[bigint]
  
  @js.native
  sealed trait binary
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait bit
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def bit: bit = "bit".asInstanceOf[bit]
  
  @js.native
  sealed trait `bit varying`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `bit varying`: `bit varying` = ("bit varying").asInstanceOf[`bit varying`]
  
  @js.native
  sealed trait blob
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait bool
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def bool: bool = "bool".asInstanceOf[bool]
  
  @js.native
  sealed trait boolean
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait box
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def box: box = "box".asInstanceOf[box]
  
  @js.native
  sealed trait browser extends StObject
  inline def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait bytea
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def bytea: bytea = "bytea".asInstanceOf[bytea]
  
  @js.native
  sealed trait bytes
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def bytes: bytes = "bytes".asInstanceOf[bytes]
  
  @js.native
  sealed trait char
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def char: char = "char".asInstanceOf[char]
  
  @js.native
  sealed trait `char varying`
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def `char varying`: `char varying` = ("char varying").asInstanceOf[`char varying`]
  
  @js.native
  sealed trait character
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def character: character = "character".asInstanceOf[character]
  
  @js.native
  sealed trait `character varying`
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def `character varying`: `character varying` = ("character varying").asInstanceOf[`character varying`]
  
  @js.native
  sealed trait cidr
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def cidr: cidr = "cidr".asInstanceOf[cidr]
  
  @js.native
  sealed trait circle
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait citext
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def citext: citext = "citext".asInstanceOf[citext]
  
  @js.native
  sealed trait clob
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def clob: clob = "clob".asInstanceOf[clob]
  
  @js.native
  sealed trait closure
    extends StObject
       with TableType
       with typings.typeorm.tableTypesMod.TableType
  inline def closure: closure = "closure".asInstanceOf[closure]
  
  @js.native
  sealed trait `closure-junction`
    extends StObject
       with TableType
       with typings.typeorm.tableTypesMod.TableType
  inline def `closure-junction`: `closure-junction` = "closure-junction".asInstanceOf[`closure-junction`]
  
  @js.native
  sealed trait `closure-table`
    extends StObject
       with TreeType
       with typings.typeorm.treeTypesMod.TreeType
  inline def `closure-table`: `closure-table` = "closure-table".asInstanceOf[`closure-table`]
  
  @js.native
  sealed trait cockroachdb
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def cockroachdb: cockroachdb = "cockroachdb".asInstanceOf[cockroachdb]
  
  @js.native
  sealed trait cordova
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def cordova: cordova = "cordova".asInstanceOf[cordova]
  
  @js.native
  sealed trait `create-pojo`
    extends StObject
       with SelectQueryBuilderOption
       with typings.typeorm.queryBuilderSelectQueryBuilderOptionMod.SelectQueryBuilderOption
  inline def `create-pojo`: `create-pojo` = "create-pojo".asInstanceOf[`create-pojo`]
  
  @js.native
  sealed trait createDate
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  inline def createDate: createDate = "createDate".asInstanceOf[createDate]
  
  @js.native
  sealed trait cube
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def cube: cube = "cube".asInstanceOf[cube]
  
  @js.native
  sealed trait database extends StObject
  inline def database: database = "database".asInstanceOf[database]
  
  @js.native
  sealed trait date
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait daterange
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def daterange: daterange = "daterange".asInstanceOf[daterange]
  
  @js.native
  sealed trait datetime
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def datetime: datetime = "datetime".asInstanceOf[datetime]
  
  @js.native
  sealed trait datetime2
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def datetime2: datetime2 = "datetime2".asInstanceOf[datetime2]
  
  @js.native
  sealed trait datetimeoffset
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def datetimeoffset: datetimeoffset = "datetimeoffset".asInstanceOf[datetimeoffset]
  
  @js.native
  sealed trait debug extends StObject
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait dec
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def dec: dec = "dec".asInstanceOf[dec]
  
  @js.native
  sealed trait decimal
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait deleteDate
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  inline def deleteDate: deleteDate = "deleteDate".asInstanceOf[deleteDate]
  
  @js.native
  sealed trait descendant extends StObject
  inline def descendant: descendant = "descendant".asInstanceOf[descendant]
  
  @js.native
  sealed trait dirty_read extends StObject
  inline def dirty_read: dirty_read = "dirty_read".asInstanceOf[dirty_read]
  
  @js.native
  sealed trait `disable-global-order`
    extends StObject
       with SelectQueryBuilderOption
       with typings.typeorm.queryBuilderSelectQueryBuilderOptionMod.SelectQueryBuilderOption
  inline def `disable-global-order`: `disable-global-order` = "disable-global-order".asInstanceOf[`disable-global-order`]
  
  @js.native
  sealed trait double
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait `double precision`
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def `double precision`: `double precision` = ("double precision").asInstanceOf[`double precision`]
  
  @js.native
  sealed trait each extends StObject
  inline def each: each = "each".asInstanceOf[each]
  
  @js.native
  sealed trait `entity-child`
    extends StObject
       with TableType
       with typings.typeorm.tableTypesMod.TableType
  inline def `entity-child`: `entity-child` = "entity-child".asInstanceOf[`entity-child`]
  
  @js.native
  sealed trait `enum`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `enum`: `enum` = "enum".asInstanceOf[`enum`]
  
  @js.native
  sealed trait equal
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def equal: equal = "equal".asInstanceOf[equal]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait expo
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def expo: expo = "expo".asInstanceOf[expo]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fixed
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait float
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def float: float = "float".asInstanceOf[float]
  
  @js.native
  sealed trait float4
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def float4: float4 = "float4".asInstanceOf[float4]
  
  @js.native
  sealed trait float8
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def float8: float8 = "float8".asInstanceOf[float8]
  
  @js.native
  sealed trait for_no_key_update extends StObject
  inline def for_no_key_update: for_no_key_update = "for_no_key_update".asInstanceOf[for_no_key_update]
  
  @js.native
  sealed trait from extends StObject
  inline def from: from = "from".asInstanceOf[from]
  
  @js.native
  sealed trait geography
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with SpatialColumnType
       with typings.typeorm.columnTypesMod.SpatialColumnType
  inline def geography: geography = "geography".asInstanceOf[geography]
  
  @js.native
  sealed trait geometry
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with SpatialColumnType
       with typings.typeorm.columnTypesMod.SpatialColumnType
  inline def geometry: geometry = "geometry".asInstanceOf[geometry]
  
  @js.native
  sealed trait geometrycollection
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def geometrycollection: geometrycollection = "geometrycollection".asInstanceOf[geometrycollection]
  
  @js.native
  sealed trait hierarchyid
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def hierarchyid: hierarchyid = "hierarchyid".asInstanceOf[hierarchyid]
  
  @js.native
  sealed trait hstore
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def hstore: hstore = "hstore".asInstanceOf[hstore]
  
  @js.native
  sealed trait ilike
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def ilike: ilike = "ilike".asInstanceOf[ilike]
  
  @js.native
  sealed trait image
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait in
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait increment extends StObject
  inline def increment: increment = "increment".asInstanceOf[increment]
  
  @js.native
  sealed trait inet
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def inet: inet = "inet".asInstanceOf[inet]
  
  @js.native
  sealed trait info extends StObject
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait insert extends StObject
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait int
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithWidthColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  inline def int: int = "int".asInstanceOf[int]
  
  @js.native
  sealed trait int2
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def int2: int2 = "int2".asInstanceOf[int2]
  
  @js.native
  sealed trait int4
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def int4: int4 = "int4".asInstanceOf[int4]
  
  @js.native
  sealed trait int4range
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def int4range: int4range = "int4range".asInstanceOf[int4range]
  
  @js.native
  sealed trait int64
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def int64: int64 = "int64".asInstanceOf[int64]
  
  @js.native
  sealed trait int8
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def int8: int8 = "int8".asInstanceOf[int8]
  
  @js.native
  sealed trait int8range
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def int8range: int8range = "int8range".asInstanceOf[int8range]
  
  @js.native
  sealed trait integer
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait interval
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def interval: interval = "interval".asInstanceOf[interval]
  
  @js.native
  sealed trait `interval day to second`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `interval day to second`: `interval day to second` = ("interval day to second").asInstanceOf[`interval day to second`]
  
  @js.native
  sealed trait `interval year to month`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `interval year to month`: `interval year to month` = ("interval year to month").asInstanceOf[`interval year to month`]
  
  @js.native
  sealed trait ioredis extends StObject
  inline def ioredis: ioredis = "ioredis".asInstanceOf[ioredis]
  
  @js.native
  sealed trait ioredisSlashcluster extends StObject
  inline def ioredisSlashcluster: ioredisSlashcluster = "ioredis/cluster".asInstanceOf[ioredisSlashcluster]
  
  @js.native
  sealed trait isNull
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def isNull: isNull = "isNull".asInstanceOf[isNull]
  
  @js.native
  sealed trait join extends StObject
  inline def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait json
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait jsonb
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def jsonb: jsonb = "jsonb".asInstanceOf[jsonb]
  
  @js.native
  sealed trait junction
    extends StObject
       with TableType
       with typings.typeorm.tableTypesMod.TableType
  inline def junction: junction = "junction".asInstanceOf[junction]
  
  @js.native
  sealed trait lessThan
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def lessThan: lessThan = "lessThan".asInstanceOf[lessThan]
  
  @js.native
  sealed trait lessThanOrEqual
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def lessThanOrEqual: lessThanOrEqual = "lessThanOrEqual".asInstanceOf[lessThanOrEqual]
  
  @js.native
  sealed trait like
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def like: like = "like".asInstanceOf[like]
  
  @js.native
  sealed trait line
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait linearizable
    extends StObject
       with ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  inline def linearizable: linearizable = "linearizable".asInstanceOf[linearizable]
  
  @js.native
  sealed trait linestring
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def linestring: linestring = "linestring".asInstanceOf[linestring]
  
  @js.native
  sealed trait local
    extends StObject
       with ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait log extends StObject
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait long
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait `long raw`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `long raw`: `long raw` = ("long raw").asInstanceOf[`long raw`]
  
  @js.native
  sealed trait longblob
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def longblob: longblob = "longblob".asInstanceOf[longblob]
  
  @js.native
  sealed trait longtext
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def longtext: longtext = "longtext".asInstanceOf[longtext]
  
  @js.native
  sealed trait lseg
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def lseg: lseg = "lseg".asInstanceOf[lseg]
  
  @js.native
  sealed trait ltree
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def ltree: ltree = "ltree".asInstanceOf[ltree]
  
  @js.native
  sealed trait macaddr
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def macaddr: macaddr = "macaddr".asInstanceOf[macaddr]
  
  @js.native
  sealed trait majority
    extends StObject
       with ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  inline def majority: majority = "majority".asInstanceOf[majority]
  
  @js.native
  sealed trait `many-to-many`
    extends StObject
       with RelationType
       with typings.typeorm.relationTypesMod.RelationType
  inline def `many-to-many`: `many-to-many` = "many-to-many".asInstanceOf[`many-to-many`]
  
  @js.native
  sealed trait `many-to-one`
    extends StObject
       with RelationType
       with typings.typeorm.relationTypesMod.RelationType
  inline def `many-to-one`: `many-to-one` = "many-to-one".asInstanceOf[`many-to-one`]
  
  @js.native
  sealed trait mariadb
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def mariadb: mariadb = "mariadb".asInstanceOf[mariadb]
  
  @js.native
  sealed trait master
    extends StObject
       with ReplicationMode
       with typings.typeorm.typesReplicationModeMod.ReplicationMode
  inline def master: master = "master".asInstanceOf[master]
  
  @js.native
  sealed trait `materialized-path`
    extends StObject
       with TreeType
       with typings.typeorm.treeTypesMod.TreeType
  inline def `materialized-path`: `materialized-path` = "materialized-path".asInstanceOf[`materialized-path`]
  
  @js.native
  sealed trait mediumblob
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def mediumblob: mediumblob = "mediumblob".asInstanceOf[mediumblob]
  
  @js.native
  sealed trait mediumint
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithWidthColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  inline def mediumint: mediumint = "mediumint".asInstanceOf[mediumint]
  
  @js.native
  sealed trait mediumtext
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def mediumtext: mediumtext = "mediumtext".asInstanceOf[mediumtext]
  
  @js.native
  sealed trait migration extends StObject
  inline def migration: migration = "migration".asInstanceOf[migration]
  
  @js.native
  sealed trait money
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def money: money = "money".asInstanceOf[money]
  
  @js.native
  sealed trait mongodb
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  
  @js.native
  sealed trait moreThan
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def moreThan: moreThan = "moreThan".asInstanceOf[moreThan]
  
  @js.native
  sealed trait moreThanOrEqual
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def moreThanOrEqual: moreThanOrEqual = "moreThanOrEqual".asInstanceOf[moreThanOrEqual]
  
  @js.native
  sealed trait mssql
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def mssql: mssql = "mssql".asInstanceOf[mssql]
  
  @js.native
  sealed trait multilinestring
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def multilinestring: multilinestring = "multilinestring".asInstanceOf[multilinestring]
  
  @js.native
  sealed trait multipoint
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def multipoint: multipoint = "multipoint".asInstanceOf[multipoint]
  
  @js.native
  sealed trait multipolygon
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def multipolygon: multipolygon = "multipolygon".asInstanceOf[multipolygon]
  
  @js.native
  sealed trait mysql
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def mysql: mysql = "mysql".asInstanceOf[mysql]
  
  @js.native
  sealed trait `national char`
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def `national char`: `national char` = ("national char").asInstanceOf[`national char`]
  
  @js.native
  sealed trait `national varchar`
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def `national varchar`: `national varchar` = ("national varchar").asInstanceOf[`national varchar`]
  
  @js.native
  sealed trait `native character`
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def `native character`: `native character` = ("native character").asInstanceOf[`native character`]
  
  @js.native
  sealed trait nativescript
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def nativescript: nativescript = "nativescript".asInstanceOf[nativescript]
  
  @js.native
  sealed trait nchar
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def nchar: nchar = "nchar".asInstanceOf[nchar]
  
  @js.native
  sealed trait nclob
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def nclob: nclob = "nclob".asInstanceOf[nclob]
  
  @js.native
  sealed trait `nested-set`
    extends StObject
       with TreeType
       with typings.typeorm.treeTypesMod.TreeType
  inline def `nested-set`: `nested-set` = "nested-set".asInstanceOf[`nested-set`]
  
  @js.native
  sealed trait node extends StObject
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait not
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  inline def not: not = "not".asInstanceOf[not]
  
  @js.native
  sealed trait ntext
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def ntext: ntext = "ntext".asInstanceOf[ntext]
  
  @js.native
  sealed trait number
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait numeric
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait numrange
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def numrange: numrange = "numrange".asInstanceOf[numrange]
  
  @js.native
  sealed trait nvarchar
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def nvarchar: nvarchar = "nvarchar".asInstanceOf[nvarchar]
  
  @js.native
  sealed trait nvarchar2
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def nvarchar2: nvarchar2 = "nvarchar2".asInstanceOf[nvarchar2]
  
  @js.native
  sealed trait `object` extends StObject
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait objectId
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  inline def objectId: objectId = "objectId".asInstanceOf[objectId]
  
  @js.native
  sealed trait `one-to-many`
    extends StObject
       with RelationType
       with typings.typeorm.relationTypesMod.RelationType
  inline def `one-to-many`: `one-to-many` = "one-to-many".asInstanceOf[`one-to-many`]
  
  @js.native
  sealed trait `one-to-one`
    extends StObject
       with RelationType
       with typings.typeorm.relationTypesMod.RelationType
  inline def `one-to-one`: `one-to-one` = "one-to-one".asInstanceOf[`one-to-one`]
  
  @js.native
  sealed trait optimistic extends StObject
  inline def optimistic: optimistic = "optimistic".asInstanceOf[optimistic]
  
  @js.native
  sealed trait or extends StObject
  inline def or: or = "or".asInstanceOf[or]
  
  @js.native
  sealed trait oracle
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def oracle: oracle = "oracle".asInstanceOf[oracle]
  
  @js.native
  sealed trait other extends StObject
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait path
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait pessimistic_partial_write extends StObject
  inline def pessimistic_partial_write: pessimistic_partial_write = "pessimistic_partial_write".asInstanceOf[pessimistic_partial_write]
  
  @js.native
  sealed trait pessimistic_read extends StObject
  inline def pessimistic_read: pessimistic_read = "pessimistic_read".asInstanceOf[pessimistic_read]
  
  @js.native
  sealed trait pessimistic_write extends StObject
  inline def pessimistic_write: pessimistic_write = "pessimistic_write".asInstanceOf[pessimistic_write]
  
  @js.native
  sealed trait pessimistic_write_or_fail extends StObject
  inline def pessimistic_write_or_fail: pessimistic_write_or_fail = "pessimistic_write_or_fail".asInstanceOf[pessimistic_write_or_fail]
  
  @js.native
  sealed trait pgcrypto extends StObject
  inline def pgcrypto: pgcrypto = "pgcrypto".asInstanceOf[pgcrypto]
  
  @js.native
  sealed trait point
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait polygon
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def polygon: polygon = "polygon".asInstanceOf[polygon]
  
  @js.native
  sealed trait postgres
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def postgres: postgres = "postgres".asInstanceOf[postgres]
  
  @js.native
  sealed trait query extends StObject
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait raw
    extends StObject
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait `react-native`
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def `react-native`: `react-native` = "react-native".asInstanceOf[`react-native`]
  
  @js.native
  sealed trait real
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def real: real = "real".asInstanceOf[real]
  
  @js.native
  sealed trait recover extends StObject
  inline def recover: recover = "recover".asInstanceOf[recover]
  
  @js.native
  sealed trait redis extends StObject
  inline def redis: redis = "redis".asInstanceOf[redis]
  
  @js.native
  sealed trait regular
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
       with TableType
       with typings.typeorm.tableTypesMod.TableType
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait relation extends StObject
  inline def relation: relation = "relation".asInstanceOf[relation]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait restore extends StObject
  inline def restore: restore = "restore".asInstanceOf[restore]
  
  @js.native
  sealed trait rowid
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def rowid: rowid = "rowid".asInstanceOf[rowid]
  
  @js.native
  sealed trait rowversion
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def rowversion: rowversion = "rowversion".asInstanceOf[rowversion]
  
  @js.native
  sealed trait sap
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def sap: sap = "sap".asInstanceOf[sap]
  
  @js.native
  sealed trait save extends StObject
  inline def save: save = "save".asInstanceOf[save]
  
  @js.native
  sealed trait schema extends StObject
  inline def schema: schema = "schema".asInstanceOf[schema]
  
  @js.native
  sealed trait seconddate
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def seconddate: seconddate = "seconddate".asInstanceOf[seconddate]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait set
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait shorttext
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def shorttext: shorttext = "shorttext".asInstanceOf[shorttext]
  
  @js.native
  sealed trait simple extends StObject
  inline def simple: simple = "simple".asInstanceOf[simple]
  
  @js.native
  sealed trait `simple-array`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `simple-array`: `simple-array` = "simple-array".asInstanceOf[`simple-array`]
  
  @js.native
  sealed trait `simple-console` extends StObject
  inline def `simple-console`: `simple-console` = "simple-console".asInstanceOf[`simple-console`]
  
  @js.native
  sealed trait `simple-enum`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `simple-enum`: `simple-enum` = "simple-enum".asInstanceOf[`simple-enum`]
  
  @js.native
  sealed trait `simple-json`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `simple-json`: `simple-json` = "simple-json".asInstanceOf[`simple-json`]
  
  @js.native
  sealed trait slave
    extends StObject
       with ReplicationMode
       with typings.typeorm.typesReplicationModeMod.ReplicationMode
  inline def slave: slave = "slave".asInstanceOf[slave]
  
  @js.native
  sealed trait smalldatetime
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def smalldatetime: smalldatetime = "smalldatetime".asInstanceOf[smalldatetime]
  
  @js.native
  sealed trait smalldecimal
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def smalldecimal: smalldecimal = "smalldecimal".asInstanceOf[smalldecimal]
  
  @js.native
  sealed trait smallint
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithWidthColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  inline def smallint: smallint = "smallint".asInstanceOf[smallint]
  
  @js.native
  sealed trait smallmoney
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def smallmoney: smallmoney = "smallmoney".asInstanceOf[smallmoney]
  
  @js.native
  sealed trait snapshot_
    extends StObject
       with ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  inline def snapshot_ : snapshot_ = "snapshot".asInstanceOf[snapshot_]
  
  @js.native
  sealed trait `soft-delete` extends StObject
  inline def `soft-delete`: `soft-delete` = "soft-delete".asInstanceOf[`soft-delete`]
  
  @js.native
  sealed trait `soft-remove` extends StObject
  inline def `soft-remove`: `soft-remove` = "soft-remove".asInstanceOf[`soft-remove`]
  
  @js.native
  sealed trait sql_variant
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def sql_variant: sql_variant = "sql_variant".asInstanceOf[sql_variant]
  
  @js.native
  sealed trait sqlite
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def sqlite: sqlite = "sqlite".asInstanceOf[sqlite]
  
  @js.native
  sealed trait sqljs
    extends StObject
       with DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  inline def sqljs: sqljs = "sqljs".asInstanceOf[sqljs]
  
  @js.native
  sealed trait st_geometry
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with SpatialColumnType
       with typings.typeorm.columnTypesMod.SpatialColumnType
  inline def st_geometry: st_geometry = "st_geometry".asInstanceOf[st_geometry]
  
  @js.native
  sealed trait st_point
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with SpatialColumnType
       with typings.typeorm.columnTypesMod.SpatialColumnType
  inline def st_point: st_point = "st_point".asInstanceOf[st_point]
  
  @js.native
  sealed trait string
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait text
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait time
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait `time with time zone`
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def `time with time zone`: `time with time zone` = ("time with time zone").asInstanceOf[`time with time zone`]
  
  @js.native
  sealed trait `time without time zone`
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def `time without time zone`: `time without time zone` = ("time without time zone").asInstanceOf[`time without time zone`]
  
  @js.native
  sealed trait timestamp
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait `timestamp with local time zone`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def `timestamp with local time zone`: `timestamp with local time zone` = ("timestamp with local time zone").asInstanceOf[`timestamp with local time zone`]
  
  @js.native
  sealed trait `timestamp with time zone`
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def `timestamp with time zone`: `timestamp with time zone` = ("timestamp with time zone").asInstanceOf[`timestamp with time zone`]
  
  @js.native
  sealed trait `timestamp without time zone`
    extends StObject
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  inline def `timestamp without time zone`: `timestamp without time zone` = ("timestamp without time zone").asInstanceOf[`timestamp without time zone`]
  
  @js.native
  sealed trait timestamptz
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def timestamptz: timestamptz = "timestamptz".asInstanceOf[timestamptz]
  
  @js.native
  sealed trait timetz
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def timetz: timetz = "timetz".asInstanceOf[timetz]
  
  @js.native
  sealed trait tinyblob
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def tinyblob: tinyblob = "tinyblob".asInstanceOf[tinyblob]
  
  @js.native
  sealed trait tinyint
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with WithWidthColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  inline def tinyint: tinyint = "tinyint".asInstanceOf[tinyint]
  
  @js.native
  sealed trait tinytext
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def tinytext: tinytext = "tinytext".asInstanceOf[tinytext]
  
  @js.native
  sealed trait treeChildrenCount
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  inline def treeChildrenCount: treeChildrenCount = "treeChildrenCount".asInstanceOf[treeChildrenCount]
  
  @js.native
  sealed trait treeLevel
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  inline def treeLevel: treeLevel = "treeLevel".asInstanceOf[treeLevel]
  
  @js.native
  sealed trait tsquery
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def tsquery: tsquery = "tsquery".asInstanceOf[tsquery]
  
  @js.native
  sealed trait tsrange
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def tsrange: tsrange = "tsrange".asInstanceOf[tsrange]
  
  @js.native
  sealed trait tstzrange
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def tstzrange: tstzrange = "tstzrange".asInstanceOf[tstzrange]
  
  @js.native
  sealed trait tsvector
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def tsvector: tsvector = "tsvector".asInstanceOf[tsvector]
  
  @js.native
  sealed trait udt extends StObject
  inline def udt: udt = "udt".asInstanceOf[udt]
  
  @js.native
  sealed trait uniqueidentifier
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def uniqueidentifier: uniqueidentifier = "uniqueidentifier".asInstanceOf[uniqueidentifier]
  
  @js.native
  sealed trait `unsigned big int`
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def `unsigned big int`: `unsigned big int` = ("unsigned big int").asInstanceOf[`unsigned big int`]
  
  @js.native
  sealed trait update extends StObject
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait updateDate
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  inline def updateDate: updateDate = "updateDate".asInstanceOf[updateDate]
  
  @js.native
  sealed trait urowid
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def urowid: urowid = "urowid".asInstanceOf[urowid]
  
  @js.native
  sealed trait uuid
    extends StObject
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def uuid: uuid = "uuid".asInstanceOf[uuid]
  
  @js.native
  sealed trait `uuid-ossp` extends StObject
  inline def `uuid-ossp`: `uuid-ossp` = "uuid-ossp".asInstanceOf[`uuid-ossp`]
  
  @js.native
  sealed trait varbinary
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def varbinary: varbinary = "varbinary".asInstanceOf[varbinary]
  
  @js.native
  sealed trait varbit
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def varbit: varbit = "varbit".asInstanceOf[varbit]
  
  @js.native
  sealed trait varchar
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def varchar: varchar = "varchar".asInstanceOf[varchar]
  
  @js.native
  sealed trait varchar2
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def varchar2: varchar2 = "varchar2".asInstanceOf[varchar2]
  
  @js.native
  sealed trait variant extends StObject
  inline def variant: variant = "variant".asInstanceOf[variant]
  
  @js.native
  sealed trait `varying character`
    extends StObject
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  inline def `varying character`: `varying character` = ("varying character").asInstanceOf[`varying character`]
  
  @js.native
  sealed trait version
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  inline def version: version = "version".asInstanceOf[version]
  
  @js.native
  sealed trait view
    extends StObject
       with TableType
       with typings.typeorm.tableTypesMod.TableType
  inline def view: view = "view".asInstanceOf[view]
  
  @js.native
  sealed trait virtual_
    extends StObject
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  inline def virtual_ : virtual_ = "virtual".asInstanceOf[virtual_]
  
  @js.native
  sealed trait warn extends StObject
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait xml
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait year
    extends StObject
       with SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  inline def year: year = "year".asInstanceOf[year]
}
