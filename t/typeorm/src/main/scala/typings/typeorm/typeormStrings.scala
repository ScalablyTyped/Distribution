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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeormStrings {
  
  @js.native
  sealed trait ASC extends StObject
  @scala.inline
  def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait CASCADE
    extends OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  @scala.inline
  def CASCADE: CASCADE = "CASCADE".asInstanceOf[CASCADE]
  
  @js.native
  sealed trait DEFAULT
    extends OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait DESC extends StObject
  @scala.inline
  def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait DeepPartial extends StObject
  @scala.inline
  def DeepPartial: DeepPartial = "DeepPartial".asInstanceOf[DeepPartial]
  
  @js.native
  sealed trait EntitySchemaOptions extends StObject
  @scala.inline
  def EntitySchemaOptions: EntitySchemaOptions = "EntitySchemaOptions".asInstanceOf[EntitySchemaOptions]
  
  @js.native
  sealed trait FilterQuery extends StObject
  @scala.inline
  def FilterQuery: FilterQuery = "FilterQuery".asInstanceOf[FilterQuery]
  
  @js.native
  sealed trait FindConditions extends StObject
  @scala.inline
  def FindConditions: FindConditions = "FindConditions".asInstanceOf[FindConditions]
  
  @js.native
  sealed trait FindOneOptions extends StObject
  @scala.inline
  def FindOneOptions: FindOneOptions = "FindOneOptions".asInstanceOf[FindOneOptions]
  
  @js.native
  sealed trait `INITIALLY DEFERRED`
    extends DeferrableType
       with typings.typeorm.deferrableTypeMod.DeferrableType
  @scala.inline
  def `INITIALLY DEFERRED`: `INITIALLY DEFERRED` = ("INITIALLY DEFERRED").asInstanceOf[`INITIALLY DEFERRED`]
  
  @js.native
  sealed trait `INITIALLY IMMEDIATE`
    extends DeferrableType
       with typings.typeorm.deferrableTypeMod.DeferrableType
  @scala.inline
  def `INITIALLY IMMEDIATE`: `INITIALLY IMMEDIATE` = ("INITIALLY IMMEDIATE").asInstanceOf[`INITIALLY IMMEDIATE`]
  
  @js.native
  sealed trait INNER extends StObject
  @scala.inline
  def INNER: INNER = "INNER".asInstanceOf[INNER]
  
  @js.native
  sealed trait LEFT extends StObject
  @scala.inline
  def LEFT: LEFT = "LEFT".asInstanceOf[LEFT]
  
  @js.native
  sealed trait `NO ACTION`
    extends OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  @scala.inline
  def `NO ACTION`: `NO ACTION` = ("NO ACTION").asInstanceOf[`NO ACTION`]
  
  @js.native
  sealed trait `NULLS FIRST` extends StObject
  @scala.inline
  def `NULLS FIRST`: `NULLS FIRST` = ("NULLS FIRST").asInstanceOf[`NULLS FIRST`]
  
  @js.native
  sealed trait `NULLS LAST` extends StObject
  @scala.inline
  def `NULLS LAST`: `NULLS LAST` = ("NULLS LAST").asInstanceOf[`NULLS LAST`]
  
  @js.native
  sealed trait ORDER extends StObject
  @scala.inline
  def ORDER: ORDER = "ORDER".asInstanceOf[ORDER]
  
  @js.native
  sealed trait QueryDeepPartialEntity extends StObject
  @scala.inline
  def QueryDeepPartialEntity: QueryDeepPartialEntity = "QueryDeepPartialEntity".asInstanceOf[QueryDeepPartialEntity]
  
  @js.native
  sealed trait QueryPartialEntity extends StObject
  @scala.inline
  def QueryPartialEntity: QueryPartialEntity = "QueryPartialEntity".asInstanceOf[QueryPartialEntity]
  
  @js.native
  sealed trait RANDOM extends StObject
  @scala.inline
  def RANDOM: RANDOM = "RANDOM".asInstanceOf[RANDOM]
  
  @js.native
  sealed trait `READ COMMITTED`
    extends IsolationLevel
       with typings.typeorm.typesIsolationLevelMod.IsolationLevel
  @scala.inline
  def `READ COMMITTED`: `READ COMMITTED` = ("READ COMMITTED").asInstanceOf[`READ COMMITTED`]
  
  @js.native
  sealed trait `READ UNCOMMITTED`
    extends IsolationLevel
       with typings.typeorm.typesIsolationLevelMod.IsolationLevel
  @scala.inline
  def `READ UNCOMMITTED`: `READ UNCOMMITTED` = ("READ UNCOMMITTED").asInstanceOf[`READ UNCOMMITTED`]
  
  @js.native
  sealed trait READ_COMMITTED extends StObject
  @scala.inline
  def READ_COMMITTED: READ_COMMITTED = "READ_COMMITTED".asInstanceOf[READ_COMMITTED]
  
  @js.native
  sealed trait READ_UNCOMMITTED extends StObject
  @scala.inline
  def READ_UNCOMMITTED: READ_UNCOMMITTED = "READ_UNCOMMITTED".asInstanceOf[READ_UNCOMMITTED]
  
  @js.native
  sealed trait `REPEATABLE READ`
    extends IsolationLevel
       with typings.typeorm.typesIsolationLevelMod.IsolationLevel
  @scala.inline
  def `REPEATABLE READ`: `REPEATABLE READ` = ("REPEATABLE READ").asInstanceOf[`REPEATABLE READ`]
  
  @js.native
  sealed trait REPEATABLE_READ extends StObject
  @scala.inline
  def REPEATABLE_READ: REPEATABLE_READ = "REPEATABLE_READ".asInstanceOf[REPEATABLE_READ]
  
  @js.native
  sealed trait RESTRICT
    extends OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  @scala.inline
  def RESTRICT: RESTRICT = "RESTRICT".asInstanceOf[RESTRICT]
  
  @js.native
  sealed trait RR extends StObject
  @scala.inline
  def RR: RR = "RR".asInstanceOf[RR]
  
  @js.native
  sealed trait SERIALIZABLE
    extends IsolationLevel
       with typings.typeorm.typesIsolationLevelMod.IsolationLevel
  @scala.inline
  def SERIALIZABLE: SERIALIZABLE = "SERIALIZABLE".asInstanceOf[SERIALIZABLE]
  
  @js.native
  sealed trait `SET NULL`
    extends OnDeleteType
       with typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
       with OnUpdateType
       with typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
  @scala.inline
  def `SET NULL`: `SET NULL` = ("SET NULL").asInstanceOf[`SET NULL`]
  
  @js.native
  sealed trait SNAPSHOT extends StObject
  @scala.inline
  def SNAPSHOT: SNAPSHOT = "SNAPSHOT".asInstanceOf[SNAPSHOT]
  
  @js.native
  sealed trait STI extends StObject
  @scala.inline
  def STI: STI = "STI".asInstanceOf[STI]
  
  @js.native
  sealed trait STORED extends StObject
  @scala.inline
  def STORED: STORED = "STORED".asInstanceOf[STORED]
  
  @js.native
  sealed trait UpdateQuery extends StObject
  @scala.inline
  def UpdateQuery: UpdateQuery = "UpdateQuery".asInstanceOf[UpdateQuery]
  
  @js.native
  sealed trait VIRTUAL extends StObject
  @scala.inline
  def VIRTUAL: VIRTUAL = "VIRTUAL".asInstanceOf[VIRTUAL]
  
  @js.native
  sealed trait _empty extends StObject
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `adjacency-list`
    extends TreeType
       with typings.typeorm.treeTypesMod.TreeType
  @scala.inline
  def `adjacency-list`: `adjacency-list` = "adjacency-list".asInstanceOf[`adjacency-list`]
  
  @js.native
  sealed trait `advanced-console` extends StObject
  @scala.inline
  def `advanced-console`: `advanced-console` = "advanced-console".asInstanceOf[`advanced-console`]
  
  @js.native
  sealed trait `after-insert`
    extends EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  @scala.inline
  def `after-insert`: `after-insert` = "after-insert".asInstanceOf[`after-insert`]
  
  @js.native
  sealed trait `after-load`
    extends EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  @scala.inline
  def `after-load`: `after-load` = "after-load".asInstanceOf[`after-load`]
  
  @js.native
  sealed trait `after-remove`
    extends EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  @scala.inline
  def `after-remove`: `after-remove` = "after-remove".asInstanceOf[`after-remove`]
  
  @js.native
  sealed trait `after-update`
    extends EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  @scala.inline
  def `after-update`: `after-update` = "after-update".asInstanceOf[`after-update`]
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait alphanum
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def alphanum: alphanum = "alphanum".asInstanceOf[alphanum]
  
  @js.native
  sealed trait ancestor extends StObject
  @scala.inline
  def ancestor: ancestor = "ancestor".asInstanceOf[ancestor]
  
  @js.native
  sealed trait and extends StObject
  @scala.inline
  def and: and = "and".asInstanceOf[and]
  
  @js.native
  sealed trait any
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait array
    extends SimpleColumnType
       with ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait `aurora-data-api`
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def `aurora-data-api`: `aurora-data-api` = "aurora-data-api".asInstanceOf[`aurora-data-api`]
  
  @js.native
  sealed trait `aurora-data-api-pg`
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def `aurora-data-api-pg`: `aurora-data-api-pg` = "aurora-data-api-pg".asInstanceOf[`aurora-data-api-pg`]
  
  @js.native
  sealed trait available
    extends ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait `before-insert`
    extends EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  @scala.inline
  def `before-insert`: `before-insert` = "before-insert".asInstanceOf[`before-insert`]
  
  @js.native
  sealed trait `before-remove`
    extends EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  @scala.inline
  def `before-remove`: `before-remove` = "before-remove".asInstanceOf[`before-remove`]
  
  @js.native
  sealed trait `before-update`
    extends EventListenerType
       with typings.typeorm.eventListenerTypesMod.EventListenerType
  @scala.inline
  def `before-update`: `before-update` = "before-update".asInstanceOf[`before-update`]
  
  @js.native
  sealed trait `better-sqlite3`
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def `better-sqlite3`: `better-sqlite3` = "better-sqlite3".asInstanceOf[`better-sqlite3`]
  
  @js.native
  sealed trait between
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def between: between = "between".asInstanceOf[between]
  
  @js.native
  sealed trait bfile
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def bfile: bfile = "bfile".asInstanceOf[bfile]
  
  @js.native
  sealed trait bigint
    extends WithWidthColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  @scala.inline
  def bigint: bigint = "bigint".asInstanceOf[bigint]
  
  @js.native
  sealed trait binary
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait bit
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def bit: bit = "bit".asInstanceOf[bit]
  
  @js.native
  sealed trait `bit varying`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def `bit varying`: `bit varying` = ("bit varying").asInstanceOf[`bit varying`]
  
  @js.native
  sealed trait blob
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait bool
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  
  @js.native
  sealed trait boolean
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait box
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def box: box = "box".asInstanceOf[box]
  
  @js.native
  sealed trait browser extends StObject
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait bytea
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def bytea: bytea = "bytea".asInstanceOf[bytea]
  
  @js.native
  sealed trait bytes
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def bytes: bytes = "bytes".asInstanceOf[bytes]
  
  @js.native
  sealed trait char
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def char: char = "char".asInstanceOf[char]
  
  @js.native
  sealed trait `char varying`
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def `char varying`: `char varying` = ("char varying").asInstanceOf[`char varying`]
  
  @js.native
  sealed trait character
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def character: character = "character".asInstanceOf[character]
  
  @js.native
  sealed trait `character varying`
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def `character varying`: `character varying` = ("character varying").asInstanceOf[`character varying`]
  
  @js.native
  sealed trait cidr
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def cidr: cidr = "cidr".asInstanceOf[cidr]
  
  @js.native
  sealed trait circle
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait citext
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def citext: citext = "citext".asInstanceOf[citext]
  
  @js.native
  sealed trait clob
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def clob: clob = "clob".asInstanceOf[clob]
  
  @js.native
  sealed trait closure
    extends TableType
       with typings.typeorm.tableTypesMod.TableType
  @scala.inline
  def closure: closure = "closure".asInstanceOf[closure]
  
  @js.native
  sealed trait `closure-junction`
    extends TableType
       with typings.typeorm.tableTypesMod.TableType
  @scala.inline
  def `closure-junction`: `closure-junction` = "closure-junction".asInstanceOf[`closure-junction`]
  
  @js.native
  sealed trait `closure-table`
    extends TreeType
       with typings.typeorm.treeTypesMod.TreeType
  @scala.inline
  def `closure-table`: `closure-table` = "closure-table".asInstanceOf[`closure-table`]
  
  @js.native
  sealed trait cockroachdb
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def cockroachdb: cockroachdb = "cockroachdb".asInstanceOf[cockroachdb]
  
  @js.native
  sealed trait cordova
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def cordova: cordova = "cordova".asInstanceOf[cordova]
  
  @js.native
  sealed trait `create-pojo`
    extends SelectQueryBuilderOption
       with typings.typeorm.queryBuilderSelectQueryBuilderOptionMod.SelectQueryBuilderOption
  @scala.inline
  def `create-pojo`: `create-pojo` = "create-pojo".asInstanceOf[`create-pojo`]
  
  @js.native
  sealed trait createDate
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  @scala.inline
  def createDate: createDate = "createDate".asInstanceOf[createDate]
  
  @js.native
  sealed trait cube
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def cube: cube = "cube".asInstanceOf[cube]
  
  @js.native
  sealed trait database extends StObject
  @scala.inline
  def database: database = "database".asInstanceOf[database]
  
  @js.native
  sealed trait date
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait daterange
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def daterange: daterange = "daterange".asInstanceOf[daterange]
  
  @js.native
  sealed trait datetime
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def datetime: datetime = "datetime".asInstanceOf[datetime]
  
  @js.native
  sealed trait datetime2
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def datetime2: datetime2 = "datetime2".asInstanceOf[datetime2]
  
  @js.native
  sealed trait datetimeoffset
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def datetimeoffset: datetimeoffset = "datetimeoffset".asInstanceOf[datetimeoffset]
  
  @js.native
  sealed trait debug extends StObject
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait dec
    extends WithPrecisionColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def dec: dec = "dec".asInstanceOf[dec]
  
  @js.native
  sealed trait decimal
    extends WithPrecisionColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait delete extends StObject
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait deleteDate
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  @scala.inline
  def deleteDate: deleteDate = "deleteDate".asInstanceOf[deleteDate]
  
  @js.native
  sealed trait descendant extends StObject
  @scala.inline
  def descendant: descendant = "descendant".asInstanceOf[descendant]
  
  @js.native
  sealed trait dirty_read extends StObject
  @scala.inline
  def dirty_read: dirty_read = "dirty_read".asInstanceOf[dirty_read]
  
  @js.native
  sealed trait `disable-global-order`
    extends SelectQueryBuilderOption
       with typings.typeorm.queryBuilderSelectQueryBuilderOptionMod.SelectQueryBuilderOption
  @scala.inline
  def `disable-global-order`: `disable-global-order` = "disable-global-order".asInstanceOf[`disable-global-order`]
  
  @js.native
  sealed trait double
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait `double precision`
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def `double precision`: `double precision` = ("double precision").asInstanceOf[`double precision`]
  
  @js.native
  sealed trait each extends StObject
  @scala.inline
  def each: each = "each".asInstanceOf[each]
  
  @js.native
  sealed trait `entity-child`
    extends TableType
       with typings.typeorm.tableTypesMod.TableType
  @scala.inline
  def `entity-child`: `entity-child` = "entity-child".asInstanceOf[`entity-child`]
  
  @js.native
  sealed trait enum
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def enum: enum = "enum".asInstanceOf[enum]
  
  @js.native
  sealed trait equal
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def equal: equal = "equal".asInstanceOf[equal]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait expo
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def expo: expo = "expo".asInstanceOf[expo]
  
  @js.native
  sealed trait file extends StObject
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fixed
    extends WithPrecisionColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait float
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  
  @js.native
  sealed trait float4
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def float4: float4 = "float4".asInstanceOf[float4]
  
  @js.native
  sealed trait float8
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def float8: float8 = "float8".asInstanceOf[float8]
  
  @js.native
  sealed trait for_no_key_update extends StObject
  @scala.inline
  def for_no_key_update: for_no_key_update = "for_no_key_update".asInstanceOf[for_no_key_update]
  
  @js.native
  sealed trait from extends StObject
  @scala.inline
  def from: from = "from".asInstanceOf[from]
  
  @js.native
  sealed trait geography
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with SpatialColumnType
       with typings.typeorm.columnTypesMod.SpatialColumnType
  @scala.inline
  def geography: geography = "geography".asInstanceOf[geography]
  
  @js.native
  sealed trait geometry
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with SpatialColumnType
       with typings.typeorm.columnTypesMod.SpatialColumnType
  @scala.inline
  def geometry: geometry = "geometry".asInstanceOf[geometry]
  
  @js.native
  sealed trait geometrycollection
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def geometrycollection: geometrycollection = "geometrycollection".asInstanceOf[geometrycollection]
  
  @js.native
  sealed trait hierarchyid
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def hierarchyid: hierarchyid = "hierarchyid".asInstanceOf[hierarchyid]
  
  @js.native
  sealed trait hstore
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def hstore: hstore = "hstore".asInstanceOf[hstore]
  
  @js.native
  sealed trait ilike
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def ilike: ilike = "ilike".asInstanceOf[ilike]
  
  @js.native
  sealed trait image
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait in
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait increment extends StObject
  @scala.inline
  def increment: increment = "increment".asInstanceOf[increment]
  
  @js.native
  sealed trait inet
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def inet: inet = "inet".asInstanceOf[inet]
  
  @js.native
  sealed trait info extends StObject
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait insert extends StObject
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait int
    extends WithWidthColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  
  @js.native
  sealed trait int2
    extends SimpleColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def int2: int2 = "int2".asInstanceOf[int2]
  
  @js.native
  sealed trait int4
    extends SimpleColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def int4: int4 = "int4".asInstanceOf[int4]
  
  @js.native
  sealed trait int4range
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def int4range: int4range = "int4range".asInstanceOf[int4range]
  
  @js.native
  sealed trait int64
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def int64: int64 = "int64".asInstanceOf[int64]
  
  @js.native
  sealed trait int8
    extends SimpleColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def int8: int8 = "int8".asInstanceOf[int8]
  
  @js.native
  sealed trait int8range
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def int8range: int8range = "int8range".asInstanceOf[int8range]
  
  @js.native
  sealed trait integer
    extends SimpleColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait interval
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def interval: interval = "interval".asInstanceOf[interval]
  
  @js.native
  sealed trait `interval day to second`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def `interval day to second`: `interval day to second` = ("interval day to second").asInstanceOf[`interval day to second`]
  
  @js.native
  sealed trait `interval year to month`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def `interval year to month`: `interval year to month` = ("interval year to month").asInstanceOf[`interval year to month`]
  
  @js.native
  sealed trait ioredis extends StObject
  @scala.inline
  def ioredis: ioredis = "ioredis".asInstanceOf[ioredis]
  
  @js.native
  sealed trait ioredisSlashcluster extends StObject
  @scala.inline
  def ioredisSlashcluster: ioredisSlashcluster = "ioredis/cluster".asInstanceOf[ioredisSlashcluster]
  
  @js.native
  sealed trait isNull
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def isNull: isNull = "isNull".asInstanceOf[isNull]
  
  @js.native
  sealed trait join extends StObject
  @scala.inline
  def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait json
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait jsonb
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def jsonb: jsonb = "jsonb".asInstanceOf[jsonb]
  
  @js.native
  sealed trait junction
    extends TableType
       with typings.typeorm.tableTypesMod.TableType
  @scala.inline
  def junction: junction = "junction".asInstanceOf[junction]
  
  @js.native
  sealed trait lessThan
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def lessThan: lessThan = "lessThan".asInstanceOf[lessThan]
  
  @js.native
  sealed trait lessThanOrEqual
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def lessThanOrEqual: lessThanOrEqual = "lessThanOrEqual".asInstanceOf[lessThanOrEqual]
  
  @js.native
  sealed trait like
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def like: like = "like".asInstanceOf[like]
  
  @js.native
  sealed trait line
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait linearizable
    extends ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  @scala.inline
  def linearizable: linearizable = "linearizable".asInstanceOf[linearizable]
  
  @js.native
  sealed trait linestring
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def linestring: linestring = "linestring".asInstanceOf[linestring]
  
  @js.native
  sealed trait local
    extends ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait log extends StObject
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait long
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait `long raw`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def `long raw`: `long raw` = ("long raw").asInstanceOf[`long raw`]
  
  @js.native
  sealed trait longblob
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def longblob: longblob = "longblob".asInstanceOf[longblob]
  
  @js.native
  sealed trait longtext
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def longtext: longtext = "longtext".asInstanceOf[longtext]
  
  @js.native
  sealed trait lseg
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def lseg: lseg = "lseg".asInstanceOf[lseg]
  
  @js.native
  sealed trait ltree
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def ltree: ltree = "ltree".asInstanceOf[ltree]
  
  @js.native
  sealed trait macaddr
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def macaddr: macaddr = "macaddr".asInstanceOf[macaddr]
  
  @js.native
  sealed trait majority
    extends ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  @scala.inline
  def majority: majority = "majority".asInstanceOf[majority]
  
  @js.native
  sealed trait `many-to-many`
    extends RelationType
       with typings.typeorm.relationTypesMod.RelationType
  @scala.inline
  def `many-to-many`: `many-to-many` = "many-to-many".asInstanceOf[`many-to-many`]
  
  @js.native
  sealed trait `many-to-one`
    extends RelationType
       with typings.typeorm.relationTypesMod.RelationType
  @scala.inline
  def `many-to-one`: `many-to-one` = "many-to-one".asInstanceOf[`many-to-one`]
  
  @js.native
  sealed trait mariadb
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def mariadb: mariadb = "mariadb".asInstanceOf[mariadb]
  
  @js.native
  sealed trait master
    extends ReplicationMode
       with typings.typeorm.typesReplicationModeMod.ReplicationMode
  @scala.inline
  def master: master = "master".asInstanceOf[master]
  
  @js.native
  sealed trait `materialized-path`
    extends TreeType
       with typings.typeorm.treeTypesMod.TreeType
  @scala.inline
  def `materialized-path`: `materialized-path` = "materialized-path".asInstanceOf[`materialized-path`]
  
  @js.native
  sealed trait mediumblob
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def mediumblob: mediumblob = "mediumblob".asInstanceOf[mediumblob]
  
  @js.native
  sealed trait mediumint
    extends WithWidthColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  @scala.inline
  def mediumint: mediumint = "mediumint".asInstanceOf[mediumint]
  
  @js.native
  sealed trait mediumtext
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def mediumtext: mediumtext = "mediumtext".asInstanceOf[mediumtext]
  
  @js.native
  sealed trait migration extends StObject
  @scala.inline
  def migration: migration = "migration".asInstanceOf[migration]
  
  @js.native
  sealed trait money
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def money: money = "money".asInstanceOf[money]
  
  @js.native
  sealed trait mongodb
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  
  @js.native
  sealed trait moreThan
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def moreThan: moreThan = "moreThan".asInstanceOf[moreThan]
  
  @js.native
  sealed trait moreThanOrEqual
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def moreThanOrEqual: moreThanOrEqual = "moreThanOrEqual".asInstanceOf[moreThanOrEqual]
  
  @js.native
  sealed trait mssql
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def mssql: mssql = "mssql".asInstanceOf[mssql]
  
  @js.native
  sealed trait multilinestring
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def multilinestring: multilinestring = "multilinestring".asInstanceOf[multilinestring]
  
  @js.native
  sealed trait multipoint
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def multipoint: multipoint = "multipoint".asInstanceOf[multipoint]
  
  @js.native
  sealed trait multipolygon
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def multipolygon: multipolygon = "multipolygon".asInstanceOf[multipolygon]
  
  @js.native
  sealed trait mysql
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def mysql: mysql = "mysql".asInstanceOf[mysql]
  
  @js.native
  sealed trait `national char`
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def `national char`: `national char` = ("national char").asInstanceOf[`national char`]
  
  @js.native
  sealed trait `national varchar`
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def `national varchar`: `national varchar` = ("national varchar").asInstanceOf[`national varchar`]
  
  @js.native
  sealed trait `native character`
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def `native character`: `native character` = ("native character").asInstanceOf[`native character`]
  
  @js.native
  sealed trait nativescript
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def nativescript: nativescript = "nativescript".asInstanceOf[nativescript]
  
  @js.native
  sealed trait nchar
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def nchar: nchar = "nchar".asInstanceOf[nchar]
  
  @js.native
  sealed trait nclob
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def nclob: nclob = "nclob".asInstanceOf[nclob]
  
  @js.native
  sealed trait `nested-set`
    extends TreeType
       with typings.typeorm.treeTypesMod.TreeType
  @scala.inline
  def `nested-set`: `nested-set` = "nested-set".asInstanceOf[`nested-set`]
  
  @js.native
  sealed trait node extends StObject
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait not
    extends FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
  @scala.inline
  def not: not = "not".asInstanceOf[not]
  
  @js.native
  sealed trait ntext
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def ntext: ntext = "ntext".asInstanceOf[ntext]
  
  @js.native
  sealed trait number
    extends WithPrecisionColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait numeric
    extends WithPrecisionColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait numrange
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def numrange: numrange = "numrange".asInstanceOf[numrange]
  
  @js.native
  sealed trait nvarchar
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def nvarchar: nvarchar = "nvarchar".asInstanceOf[nvarchar]
  
  @js.native
  sealed trait nvarchar2
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def nvarchar2: nvarchar2 = "nvarchar2".asInstanceOf[nvarchar2]
  
  @js.native
  sealed trait `object` extends StObject
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait objectId
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  @scala.inline
  def objectId: objectId = "objectId".asInstanceOf[objectId]
  
  @js.native
  sealed trait `one-to-many`
    extends RelationType
       with typings.typeorm.relationTypesMod.RelationType
  @scala.inline
  def `one-to-many`: `one-to-many` = "one-to-many".asInstanceOf[`one-to-many`]
  
  @js.native
  sealed trait `one-to-one`
    extends RelationType
       with typings.typeorm.relationTypesMod.RelationType
  @scala.inline
  def `one-to-one`: `one-to-one` = "one-to-one".asInstanceOf[`one-to-one`]
  
  @js.native
  sealed trait optimistic extends StObject
  @scala.inline
  def optimistic: optimistic = "optimistic".asInstanceOf[optimistic]
  
  @js.native
  sealed trait or extends StObject
  @scala.inline
  def or: or = "or".asInstanceOf[or]
  
  @js.native
  sealed trait oracle
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def oracle: oracle = "oracle".asInstanceOf[oracle]
  
  @js.native
  sealed trait other extends StObject
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait path
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait pessimistic_partial_write extends StObject
  @scala.inline
  def pessimistic_partial_write: pessimistic_partial_write = "pessimistic_partial_write".asInstanceOf[pessimistic_partial_write]
  
  @js.native
  sealed trait pessimistic_read extends StObject
  @scala.inline
  def pessimistic_read: pessimistic_read = "pessimistic_read".asInstanceOf[pessimistic_read]
  
  @js.native
  sealed trait pessimistic_write extends StObject
  @scala.inline
  def pessimistic_write: pessimistic_write = "pessimistic_write".asInstanceOf[pessimistic_write]
  
  @js.native
  sealed trait pessimistic_write_or_fail extends StObject
  @scala.inline
  def pessimistic_write_or_fail: pessimistic_write_or_fail = "pessimistic_write_or_fail".asInstanceOf[pessimistic_write_or_fail]
  
  @js.native
  sealed trait pgcrypto extends StObject
  @scala.inline
  def pgcrypto: pgcrypto = "pgcrypto".asInstanceOf[pgcrypto]
  
  @js.native
  sealed trait point
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait polygon
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def polygon: polygon = "polygon".asInstanceOf[polygon]
  
  @js.native
  sealed trait postgres
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def postgres: postgres = "postgres".asInstanceOf[postgres]
  
  @js.native
  sealed trait query extends StObject
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait raw
    extends SimpleColumnType
       with FindOperatorType
       with typings.typeorm.findOptionsFindOperatorTypeMod.FindOperatorType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait `react-native`
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def `react-native`: `react-native` = "react-native".asInstanceOf[`react-native`]
  
  @js.native
  sealed trait real
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def real: real = "real".asInstanceOf[real]
  
  @js.native
  sealed trait recover extends StObject
  @scala.inline
  def recover: recover = "recover".asInstanceOf[recover]
  
  @js.native
  sealed trait redis extends StObject
  @scala.inline
  def redis: redis = "redis".asInstanceOf[redis]
  
  @js.native
  sealed trait regular
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
       with TableType
       with typings.typeorm.tableTypesMod.TableType
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait relation extends StObject
  @scala.inline
  def relation: relation = "relation".asInstanceOf[relation]
  
  @js.native
  sealed trait remove extends StObject
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait restore extends StObject
  @scala.inline
  def restore: restore = "restore".asInstanceOf[restore]
  
  @js.native
  sealed trait rowid
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def rowid: rowid = "rowid".asInstanceOf[rowid]
  
  @js.native
  sealed trait rowversion
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def rowversion: rowversion = "rowversion".asInstanceOf[rowversion]
  
  @js.native
  sealed trait sap
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def sap: sap = "sap".asInstanceOf[sap]
  
  @js.native
  sealed trait save extends StObject
  @scala.inline
  def save: save = "save".asInstanceOf[save]
  
  @js.native
  sealed trait schema extends StObject
  @scala.inline
  def schema: schema = "schema".asInstanceOf[schema]
  
  @js.native
  sealed trait seconddate
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def seconddate: seconddate = "seconddate".asInstanceOf[seconddate]
  
  @js.native
  sealed trait select extends StObject
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait set
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait shorttext
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def shorttext: shorttext = "shorttext".asInstanceOf[shorttext]
  
  @js.native
  sealed trait simple extends StObject
  @scala.inline
  def simple: simple = "simple".asInstanceOf[simple]
  
  @js.native
  sealed trait `simple-array`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def `simple-array`: `simple-array` = "simple-array".asInstanceOf[`simple-array`]
  
  @js.native
  sealed trait `simple-console` extends StObject
  @scala.inline
  def `simple-console`: `simple-console` = "simple-console".asInstanceOf[`simple-console`]
  
  @js.native
  sealed trait `simple-enum`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def `simple-enum`: `simple-enum` = "simple-enum".asInstanceOf[`simple-enum`]
  
  @js.native
  sealed trait `simple-json`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def `simple-json`: `simple-json` = "simple-json".asInstanceOf[`simple-json`]
  
  @js.native
  sealed trait slave
    extends ReplicationMode
       with typings.typeorm.typesReplicationModeMod.ReplicationMode
  @scala.inline
  def slave: slave = "slave".asInstanceOf[slave]
  
  @js.native
  sealed trait smalldatetime
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def smalldatetime: smalldatetime = "smalldatetime".asInstanceOf[smalldatetime]
  
  @js.native
  sealed trait smalldecimal
    extends WithPrecisionColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def smalldecimal: smalldecimal = "smalldecimal".asInstanceOf[smalldecimal]
  
  @js.native
  sealed trait smallint
    extends WithWidthColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  @scala.inline
  def smallint: smallint = "smallint".asInstanceOf[smallint]
  
  @js.native
  sealed trait smallmoney
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def smallmoney: smallmoney = "smallmoney".asInstanceOf[smallmoney]
  
  @js.native
  sealed trait snapshot_
    extends ReadConcernLevel
       with typings.typeorm.mongodbTypingsMod.ReadConcernLevel
  @scala.inline
  def snapshot_ : snapshot_ = "snapshot".asInstanceOf[snapshot_]
  
  @js.native
  sealed trait `soft-delete` extends StObject
  @scala.inline
  def `soft-delete`: `soft-delete` = "soft-delete".asInstanceOf[`soft-delete`]
  
  @js.native
  sealed trait `soft-remove` extends StObject
  @scala.inline
  def `soft-remove`: `soft-remove` = "soft-remove".asInstanceOf[`soft-remove`]
  
  @js.native
  sealed trait sql_variant
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def sql_variant: sql_variant = "sql_variant".asInstanceOf[sql_variant]
  
  @js.native
  sealed trait sqlite
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def sqlite: sqlite = "sqlite".asInstanceOf[sqlite]
  
  @js.native
  sealed trait sqljs
    extends DatabaseType
       with typings.typeorm.typesDatabaseTypeMod.DatabaseType
  @scala.inline
  def sqljs: sqljs = "sqljs".asInstanceOf[sqljs]
  
  @js.native
  sealed trait st_geometry
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with SpatialColumnType
       with typings.typeorm.columnTypesMod.SpatialColumnType
  @scala.inline
  def st_geometry: st_geometry = "st_geometry".asInstanceOf[st_geometry]
  
  @js.native
  sealed trait st_point
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with SpatialColumnType
       with typings.typeorm.columnTypesMod.SpatialColumnType
  @scala.inline
  def st_point: st_point = "st_point".asInstanceOf[st_point]
  
  @js.native
  sealed trait string
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait text
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait time
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait `time with time zone`
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def `time with time zone`: `time with time zone` = ("time with time zone").asInstanceOf[`time with time zone`]
  
  @js.native
  sealed trait `time without time zone`
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def `time without time zone`: `time without time zone` = ("time without time zone").asInstanceOf[`time without time zone`]
  
  @js.native
  sealed trait timestamp
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait `timestamp with local time zone`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def `timestamp with local time zone`: `timestamp with local time zone` = ("timestamp with local time zone").asInstanceOf[`timestamp with local time zone`]
  
  @js.native
  sealed trait `timestamp with time zone`
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def `timestamp with time zone`: `timestamp with time zone` = ("timestamp with time zone").asInstanceOf[`timestamp with time zone`]
  
  @js.native
  sealed trait `timestamp without time zone`
    extends WithPrecisionColumnType
       with typings.typeorm.columnTypesMod.WithPrecisionColumnType
  @scala.inline
  def `timestamp without time zone`: `timestamp without time zone` = ("timestamp without time zone").asInstanceOf[`timestamp without time zone`]
  
  @js.native
  sealed trait timestamptz
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def timestamptz: timestamptz = "timestamptz".asInstanceOf[timestamptz]
  
  @js.native
  sealed trait timetz
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def timetz: timetz = "timetz".asInstanceOf[timetz]
  
  @js.native
  sealed trait tinyblob
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def tinyblob: tinyblob = "tinyblob".asInstanceOf[tinyblob]
  
  @js.native
  sealed trait tinyint
    extends WithWidthColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.WithWidthColumnType
  @scala.inline
  def tinyint: tinyint = "tinyint".asInstanceOf[tinyint]
  
  @js.native
  sealed trait tinytext
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def tinytext: tinytext = "tinytext".asInstanceOf[tinytext]
  
  @js.native
  sealed trait treeChildrenCount
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  @scala.inline
  def treeChildrenCount: treeChildrenCount = "treeChildrenCount".asInstanceOf[treeChildrenCount]
  
  @js.native
  sealed trait treeLevel
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  @scala.inline
  def treeLevel: treeLevel = "treeLevel".asInstanceOf[treeLevel]
  
  @js.native
  sealed trait tsquery
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def tsquery: tsquery = "tsquery".asInstanceOf[tsquery]
  
  @js.native
  sealed trait tsrange
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def tsrange: tsrange = "tsrange".asInstanceOf[tsrange]
  
  @js.native
  sealed trait tstzrange
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def tstzrange: tstzrange = "tstzrange".asInstanceOf[tstzrange]
  
  @js.native
  sealed trait tsvector
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def tsvector: tsvector = "tsvector".asInstanceOf[tsvector]
  
  @js.native
  sealed trait udt extends StObject
  @scala.inline
  def udt: udt = "udt".asInstanceOf[udt]
  
  @js.native
  sealed trait uniqueidentifier
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def uniqueidentifier: uniqueidentifier = "uniqueidentifier".asInstanceOf[uniqueidentifier]
  
  @js.native
  sealed trait `unsigned big int`
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def `unsigned big int`: `unsigned big int` = ("unsigned big int").asInstanceOf[`unsigned big int`]
  
  @js.native
  sealed trait update extends StObject
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait updateDate
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  @scala.inline
  def updateDate: updateDate = "updateDate".asInstanceOf[updateDate]
  
  @js.native
  sealed trait urowid
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def urowid: urowid = "urowid".asInstanceOf[urowid]
  
  @js.native
  sealed trait uuid
    extends SimpleColumnType
       with PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.PrimaryGeneratedColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def uuid: uuid = "uuid".asInstanceOf[uuid]
  
  @js.native
  sealed trait `uuid-ossp` extends StObject
  @scala.inline
  def `uuid-ossp`: `uuid-ossp` = "uuid-ossp".asInstanceOf[`uuid-ossp`]
  
  @js.native
  sealed trait varbinary
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
       with WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def varbinary: varbinary = "varbinary".asInstanceOf[varbinary]
  
  @js.native
  sealed trait varbit
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def varbit: varbit = "varbit".asInstanceOf[varbit]
  
  @js.native
  sealed trait varchar
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def varchar: varchar = "varchar".asInstanceOf[varchar]
  
  @js.native
  sealed trait varchar2
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def varchar2: varchar2 = "varchar2".asInstanceOf[varchar2]
  
  @js.native
  sealed trait variant extends StObject
  @scala.inline
  def variant: variant = "variant".asInstanceOf[variant]
  
  @js.native
  sealed trait `varying character`
    extends WithLengthColumnType
       with typings.typeorm.columnTypesMod.WithLengthColumnType
  @scala.inline
  def `varying character`: `varying character` = ("varying character").asInstanceOf[`varying character`]
  
  @js.native
  sealed trait version
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  @scala.inline
  def version: version = "version".asInstanceOf[version]
  
  @js.native
  sealed trait view
    extends TableType
       with typings.typeorm.tableTypesMod.TableType
  @scala.inline
  def view: view = "view".asInstanceOf[view]
  
  @js.native
  sealed trait virtual_
    extends ColumnMode
       with typings.typeorm.columnModeMod.ColumnMode
  @scala.inline
  def virtual_ : virtual_ = "virtual".asInstanceOf[virtual_]
  
  @js.native
  sealed trait warn extends StObject
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait xml
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait year
    extends SimpleColumnType
       with typings.typeorm.columnTypesMod.SimpleColumnType
  @scala.inline
  def year: year = "year".asInstanceOf[year]
}
