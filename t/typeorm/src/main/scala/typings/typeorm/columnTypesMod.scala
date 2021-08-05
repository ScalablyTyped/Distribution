package typings.typeorm

import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.columnTypesMod.WithPrecisionColumnType
    - typings.typeorm.columnTypesMod.WithLengthColumnType
    - typings.typeorm.columnTypesMod.WithWidthColumnType
    - typings.typeorm.columnTypesMod.SpatialColumnType
    - typings.typeorm.columnTypesMod.SimpleColumnType
    - typings.std.BooleanConstructor
    - typings.std.DateConstructor
    - typings.std.NumberConstructor
    - typings.std.StringConstructor
  */
  type ColumnType = _ColumnType | BooleanConstructor | DateConstructor | NumberConstructor | StringConstructor
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.typeormStrings.int
    - typings.typeorm.typeormStrings.int2
    - typings.typeorm.typeormStrings.int4
    - typings.typeorm.typeormStrings.int8
    - typings.typeorm.typeormStrings.integer
    - typings.typeorm.typeormStrings.tinyint
    - typings.typeorm.typeormStrings.smallint
    - typings.typeorm.typeormStrings.mediumint
    - typings.typeorm.typeormStrings.bigint
    - typings.typeorm.typeormStrings.dec
    - typings.typeorm.typeormStrings.decimal
    - typings.typeorm.typeormStrings.smalldecimal
    - typings.typeorm.typeormStrings.fixed
    - typings.typeorm.typeormStrings.numeric
    - typings.typeorm.typeormStrings.number
    - typings.typeorm.typeormStrings.uuid
  */
  trait PrimaryGeneratedColumnType extends StObject
  object PrimaryGeneratedColumnType {
    
    inline def bigint: typings.typeorm.typeormStrings.bigint = "bigint".asInstanceOf[typings.typeorm.typeormStrings.bigint]
    
    inline def dec: typings.typeorm.typeormStrings.dec = "dec".asInstanceOf[typings.typeorm.typeormStrings.dec]
    
    inline def decimal: typings.typeorm.typeormStrings.decimal = "decimal".asInstanceOf[typings.typeorm.typeormStrings.decimal]
    
    inline def fixed: typings.typeorm.typeormStrings.fixed = "fixed".asInstanceOf[typings.typeorm.typeormStrings.fixed]
    
    inline def int: typings.typeorm.typeormStrings.int = "int".asInstanceOf[typings.typeorm.typeormStrings.int]
    
    inline def int2: typings.typeorm.typeormStrings.int2 = "int2".asInstanceOf[typings.typeorm.typeormStrings.int2]
    
    inline def int4: typings.typeorm.typeormStrings.int4 = "int4".asInstanceOf[typings.typeorm.typeormStrings.int4]
    
    inline def int8: typings.typeorm.typeormStrings.int8 = "int8".asInstanceOf[typings.typeorm.typeormStrings.int8]
    
    inline def integer: typings.typeorm.typeormStrings.integer = "integer".asInstanceOf[typings.typeorm.typeormStrings.integer]
    
    inline def mediumint: typings.typeorm.typeormStrings.mediumint = "mediumint".asInstanceOf[typings.typeorm.typeormStrings.mediumint]
    
    inline def number: typings.typeorm.typeormStrings.number = "number".asInstanceOf[typings.typeorm.typeormStrings.number]
    
    inline def numeric: typings.typeorm.typeormStrings.numeric = "numeric".asInstanceOf[typings.typeorm.typeormStrings.numeric]
    
    inline def smalldecimal: typings.typeorm.typeormStrings.smalldecimal = "smalldecimal".asInstanceOf[typings.typeorm.typeormStrings.smalldecimal]
    
    inline def smallint: typings.typeorm.typeormStrings.smallint = "smallint".asInstanceOf[typings.typeorm.typeormStrings.smallint]
    
    inline def tinyint: typings.typeorm.typeormStrings.tinyint = "tinyint".asInstanceOf[typings.typeorm.typeormStrings.tinyint]
    
    inline def uuid: typings.typeorm.typeormStrings.uuid = "uuid".asInstanceOf[typings.typeorm.typeormStrings.uuid]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.typeormStrings.`simple-array`
    - typings.typeorm.typeormStrings.`simple-json`
    - typings.typeorm.typeormStrings.`simple-enum`
    - typings.typeorm.typeormStrings.int2
    - typings.typeorm.typeormStrings.integer
    - typings.typeorm.typeormStrings.int4
    - typings.typeorm.typeormStrings.int8
    - typings.typeorm.typeormStrings.int64
    - typings.typeorm.typeormStrings.`unsigned big int`
    - typings.typeorm.typeormStrings.float
    - typings.typeorm.typeormStrings.float4
    - typings.typeorm.typeormStrings.float8
    - typings.typeorm.typeormStrings.smallmoney
    - typings.typeorm.typeormStrings.money
    - typings.typeorm.typeormStrings.boolean
    - typings.typeorm.typeormStrings.bool
    - typings.typeorm.typeormStrings.tinyblob
    - typings.typeorm.typeormStrings.tinytext
    - typings.typeorm.typeormStrings.mediumblob
    - typings.typeorm.typeormStrings.mediumtext
    - typings.typeorm.typeormStrings.blob
    - typings.typeorm.typeormStrings.text
    - typings.typeorm.typeormStrings.ntext
    - typings.typeorm.typeormStrings.citext
    - typings.typeorm.typeormStrings.hstore
    - typings.typeorm.typeormStrings.longblob
    - typings.typeorm.typeormStrings.longtext
    - typings.typeorm.typeormStrings.alphanum
    - typings.typeorm.typeormStrings.shorttext
    - typings.typeorm.typeormStrings.bytes
    - typings.typeorm.typeormStrings.bytea
    - typings.typeorm.typeormStrings.long
    - typings.typeorm.typeormStrings.raw
    - typings.typeorm.typeormStrings.`long raw`
    - typings.typeorm.typeormStrings.bfile
    - typings.typeorm.typeormStrings.clob
    - typings.typeorm.typeormStrings.nclob
    - typings.typeorm.typeormStrings.image
    - typings.typeorm.typeormStrings.timetz
    - typings.typeorm.typeormStrings.timestamptz
    - typings.typeorm.typeormStrings.`timestamp with local time zone`
    - typings.typeorm.typeormStrings.smalldatetime
    - typings.typeorm.typeormStrings.date
    - typings.typeorm.typeormStrings.`interval year to month`
    - typings.typeorm.typeormStrings.`interval day to second`
    - typings.typeorm.typeormStrings.interval
    - typings.typeorm.typeormStrings.year
    - typings.typeorm.typeormStrings.seconddate
    - typings.typeorm.typeormStrings.point
    - typings.typeorm.typeormStrings.line
    - typings.typeorm.typeormStrings.lseg
    - typings.typeorm.typeormStrings.box
    - typings.typeorm.typeormStrings.circle
    - typings.typeorm.typeormStrings.path
    - typings.typeorm.typeormStrings.polygon
    - typings.typeorm.typeormStrings.geography
    - typings.typeorm.typeormStrings.geometry
    - typings.typeorm.typeormStrings.linestring
    - typings.typeorm.typeormStrings.multipoint
    - typings.typeorm.typeormStrings.multilinestring
    - typings.typeorm.typeormStrings.multipolygon
    - typings.typeorm.typeormStrings.geometrycollection
    - typings.typeorm.typeormStrings.st_geometry
    - typings.typeorm.typeormStrings.st_point
    - typings.typeorm.typeormStrings.int4range
    - typings.typeorm.typeormStrings.int8range
    - typings.typeorm.typeormStrings.numrange
    - typings.typeorm.typeormStrings.tsrange
    - typings.typeorm.typeormStrings.tstzrange
    - typings.typeorm.typeormStrings.daterange
    - typings.typeorm.typeormStrings.`enum`
    - typings.typeorm.typeormStrings.set
    - typings.typeorm.typeormStrings.cidr
    - typings.typeorm.typeormStrings.inet
    - typings.typeorm.typeormStrings.macaddr
    - typings.typeorm.typeormStrings.bit
    - typings.typeorm.typeormStrings.`bit varying`
    - typings.typeorm.typeormStrings.varbit
    - typings.typeorm.typeormStrings.tsvector
    - typings.typeorm.typeormStrings.tsquery
    - typings.typeorm.typeormStrings.uuid
    - typings.typeorm.typeormStrings.xml
    - typings.typeorm.typeormStrings.json
    - typings.typeorm.typeormStrings.jsonb
    - typings.typeorm.typeormStrings.varbinary
    - typings.typeorm.typeormStrings.hierarchyid
    - typings.typeorm.typeormStrings.sql_variant
    - typings.typeorm.typeormStrings.rowid
    - typings.typeorm.typeormStrings.urowid
    - typings.typeorm.typeormStrings.uniqueidentifier
    - typings.typeorm.typeormStrings.rowversion
    - typings.typeorm.typeormStrings.array
    - typings.typeorm.typeormStrings.cube
    - typings.typeorm.typeormStrings.ltree
  */
  trait SimpleColumnType
    extends StObject
       with _ColumnType
  object SimpleColumnType {
    
    inline def alphanum: typings.typeorm.typeormStrings.alphanum = "alphanum".asInstanceOf[typings.typeorm.typeormStrings.alphanum]
    
    inline def array: typings.typeorm.typeormStrings.array = "array".asInstanceOf[typings.typeorm.typeormStrings.array]
    
    inline def bfile: typings.typeorm.typeormStrings.bfile = "bfile".asInstanceOf[typings.typeorm.typeormStrings.bfile]
    
    inline def bit: typings.typeorm.typeormStrings.bit = "bit".asInstanceOf[typings.typeorm.typeormStrings.bit]
    
    inline def `bit varying`: typings.typeorm.typeormStrings.`bit varying` = ("bit varying").asInstanceOf[typings.typeorm.typeormStrings.`bit varying`]
    
    inline def blob: typings.typeorm.typeormStrings.blob = "blob".asInstanceOf[typings.typeorm.typeormStrings.blob]
    
    inline def bool: typings.typeorm.typeormStrings.bool = "bool".asInstanceOf[typings.typeorm.typeormStrings.bool]
    
    inline def boolean: typings.typeorm.typeormStrings.boolean = "boolean".asInstanceOf[typings.typeorm.typeormStrings.boolean]
    
    inline def box: typings.typeorm.typeormStrings.box = "box".asInstanceOf[typings.typeorm.typeormStrings.box]
    
    inline def bytea: typings.typeorm.typeormStrings.bytea = "bytea".asInstanceOf[typings.typeorm.typeormStrings.bytea]
    
    inline def bytes: typings.typeorm.typeormStrings.bytes = "bytes".asInstanceOf[typings.typeorm.typeormStrings.bytes]
    
    inline def cidr: typings.typeorm.typeormStrings.cidr = "cidr".asInstanceOf[typings.typeorm.typeormStrings.cidr]
    
    inline def circle: typings.typeorm.typeormStrings.circle = "circle".asInstanceOf[typings.typeorm.typeormStrings.circle]
    
    inline def citext: typings.typeorm.typeormStrings.citext = "citext".asInstanceOf[typings.typeorm.typeormStrings.citext]
    
    inline def clob: typings.typeorm.typeormStrings.clob = "clob".asInstanceOf[typings.typeorm.typeormStrings.clob]
    
    inline def cube: typings.typeorm.typeormStrings.cube = "cube".asInstanceOf[typings.typeorm.typeormStrings.cube]
    
    inline def date: typings.typeorm.typeormStrings.date = "date".asInstanceOf[typings.typeorm.typeormStrings.date]
    
    inline def daterange: typings.typeorm.typeormStrings.daterange = "daterange".asInstanceOf[typings.typeorm.typeormStrings.daterange]
    
    inline def `enum`: typings.typeorm.typeormStrings.`enum` = "enum".asInstanceOf[typings.typeorm.typeormStrings.`enum`]
    
    inline def float: typings.typeorm.typeormStrings.float = "float".asInstanceOf[typings.typeorm.typeormStrings.float]
    
    inline def float4: typings.typeorm.typeormStrings.float4 = "float4".asInstanceOf[typings.typeorm.typeormStrings.float4]
    
    inline def float8: typings.typeorm.typeormStrings.float8 = "float8".asInstanceOf[typings.typeorm.typeormStrings.float8]
    
    inline def geography: typings.typeorm.typeormStrings.geography = "geography".asInstanceOf[typings.typeorm.typeormStrings.geography]
    
    inline def geometry: typings.typeorm.typeormStrings.geometry = "geometry".asInstanceOf[typings.typeorm.typeormStrings.geometry]
    
    inline def geometrycollection: typings.typeorm.typeormStrings.geometrycollection = "geometrycollection".asInstanceOf[typings.typeorm.typeormStrings.geometrycollection]
    
    inline def hierarchyid: typings.typeorm.typeormStrings.hierarchyid = "hierarchyid".asInstanceOf[typings.typeorm.typeormStrings.hierarchyid]
    
    inline def hstore: typings.typeorm.typeormStrings.hstore = "hstore".asInstanceOf[typings.typeorm.typeormStrings.hstore]
    
    inline def image: typings.typeorm.typeormStrings.image = "image".asInstanceOf[typings.typeorm.typeormStrings.image]
    
    inline def inet: typings.typeorm.typeormStrings.inet = "inet".asInstanceOf[typings.typeorm.typeormStrings.inet]
    
    inline def int2: typings.typeorm.typeormStrings.int2 = "int2".asInstanceOf[typings.typeorm.typeormStrings.int2]
    
    inline def int4: typings.typeorm.typeormStrings.int4 = "int4".asInstanceOf[typings.typeorm.typeormStrings.int4]
    
    inline def int4range: typings.typeorm.typeormStrings.int4range = "int4range".asInstanceOf[typings.typeorm.typeormStrings.int4range]
    
    inline def int64: typings.typeorm.typeormStrings.int64 = "int64".asInstanceOf[typings.typeorm.typeormStrings.int64]
    
    inline def int8: typings.typeorm.typeormStrings.int8 = "int8".asInstanceOf[typings.typeorm.typeormStrings.int8]
    
    inline def int8range: typings.typeorm.typeormStrings.int8range = "int8range".asInstanceOf[typings.typeorm.typeormStrings.int8range]
    
    inline def integer: typings.typeorm.typeormStrings.integer = "integer".asInstanceOf[typings.typeorm.typeormStrings.integer]
    
    inline def interval: typings.typeorm.typeormStrings.interval = "interval".asInstanceOf[typings.typeorm.typeormStrings.interval]
    
    inline def `interval day to second`: typings.typeorm.typeormStrings.`interval day to second` = ("interval day to second").asInstanceOf[typings.typeorm.typeormStrings.`interval day to second`]
    
    inline def `interval year to month`: typings.typeorm.typeormStrings.`interval year to month` = ("interval year to month").asInstanceOf[typings.typeorm.typeormStrings.`interval year to month`]
    
    inline def json: typings.typeorm.typeormStrings.json = "json".asInstanceOf[typings.typeorm.typeormStrings.json]
    
    inline def jsonb: typings.typeorm.typeormStrings.jsonb = "jsonb".asInstanceOf[typings.typeorm.typeormStrings.jsonb]
    
    inline def line: typings.typeorm.typeormStrings.line = "line".asInstanceOf[typings.typeorm.typeormStrings.line]
    
    inline def linestring: typings.typeorm.typeormStrings.linestring = "linestring".asInstanceOf[typings.typeorm.typeormStrings.linestring]
    
    inline def long: typings.typeorm.typeormStrings.long = "long".asInstanceOf[typings.typeorm.typeormStrings.long]
    
    inline def `long raw`: typings.typeorm.typeormStrings.`long raw` = ("long raw").asInstanceOf[typings.typeorm.typeormStrings.`long raw`]
    
    inline def longblob: typings.typeorm.typeormStrings.longblob = "longblob".asInstanceOf[typings.typeorm.typeormStrings.longblob]
    
    inline def longtext: typings.typeorm.typeormStrings.longtext = "longtext".asInstanceOf[typings.typeorm.typeormStrings.longtext]
    
    inline def lseg: typings.typeorm.typeormStrings.lseg = "lseg".asInstanceOf[typings.typeorm.typeormStrings.lseg]
    
    inline def ltree: typings.typeorm.typeormStrings.ltree = "ltree".asInstanceOf[typings.typeorm.typeormStrings.ltree]
    
    inline def macaddr: typings.typeorm.typeormStrings.macaddr = "macaddr".asInstanceOf[typings.typeorm.typeormStrings.macaddr]
    
    inline def mediumblob: typings.typeorm.typeormStrings.mediumblob = "mediumblob".asInstanceOf[typings.typeorm.typeormStrings.mediumblob]
    
    inline def mediumtext: typings.typeorm.typeormStrings.mediumtext = "mediumtext".asInstanceOf[typings.typeorm.typeormStrings.mediumtext]
    
    inline def money: typings.typeorm.typeormStrings.money = "money".asInstanceOf[typings.typeorm.typeormStrings.money]
    
    inline def multilinestring: typings.typeorm.typeormStrings.multilinestring = "multilinestring".asInstanceOf[typings.typeorm.typeormStrings.multilinestring]
    
    inline def multipoint: typings.typeorm.typeormStrings.multipoint = "multipoint".asInstanceOf[typings.typeorm.typeormStrings.multipoint]
    
    inline def multipolygon: typings.typeorm.typeormStrings.multipolygon = "multipolygon".asInstanceOf[typings.typeorm.typeormStrings.multipolygon]
    
    inline def nclob: typings.typeorm.typeormStrings.nclob = "nclob".asInstanceOf[typings.typeorm.typeormStrings.nclob]
    
    inline def ntext: typings.typeorm.typeormStrings.ntext = "ntext".asInstanceOf[typings.typeorm.typeormStrings.ntext]
    
    inline def numrange: typings.typeorm.typeormStrings.numrange = "numrange".asInstanceOf[typings.typeorm.typeormStrings.numrange]
    
    inline def path: typings.typeorm.typeormStrings.path = "path".asInstanceOf[typings.typeorm.typeormStrings.path]
    
    inline def point: typings.typeorm.typeormStrings.point = "point".asInstanceOf[typings.typeorm.typeormStrings.point]
    
    inline def polygon: typings.typeorm.typeormStrings.polygon = "polygon".asInstanceOf[typings.typeorm.typeormStrings.polygon]
    
    inline def raw: typings.typeorm.typeormStrings.raw = "raw".asInstanceOf[typings.typeorm.typeormStrings.raw]
    
    inline def rowid: typings.typeorm.typeormStrings.rowid = "rowid".asInstanceOf[typings.typeorm.typeormStrings.rowid]
    
    inline def rowversion: typings.typeorm.typeormStrings.rowversion = "rowversion".asInstanceOf[typings.typeorm.typeormStrings.rowversion]
    
    inline def seconddate: typings.typeorm.typeormStrings.seconddate = "seconddate".asInstanceOf[typings.typeorm.typeormStrings.seconddate]
    
    inline def set: typings.typeorm.typeormStrings.set = "set".asInstanceOf[typings.typeorm.typeormStrings.set]
    
    inline def shorttext: typings.typeorm.typeormStrings.shorttext = "shorttext".asInstanceOf[typings.typeorm.typeormStrings.shorttext]
    
    inline def `simple-array`: typings.typeorm.typeormStrings.`simple-array` = "simple-array".asInstanceOf[typings.typeorm.typeormStrings.`simple-array`]
    
    inline def `simple-enum`: typings.typeorm.typeormStrings.`simple-enum` = "simple-enum".asInstanceOf[typings.typeorm.typeormStrings.`simple-enum`]
    
    inline def `simple-json`: typings.typeorm.typeormStrings.`simple-json` = "simple-json".asInstanceOf[typings.typeorm.typeormStrings.`simple-json`]
    
    inline def smalldatetime: typings.typeorm.typeormStrings.smalldatetime = "smalldatetime".asInstanceOf[typings.typeorm.typeormStrings.smalldatetime]
    
    inline def smallmoney: typings.typeorm.typeormStrings.smallmoney = "smallmoney".asInstanceOf[typings.typeorm.typeormStrings.smallmoney]
    
    inline def sql_variant: typings.typeorm.typeormStrings.sql_variant = "sql_variant".asInstanceOf[typings.typeorm.typeormStrings.sql_variant]
    
    inline def st_geometry: typings.typeorm.typeormStrings.st_geometry = "st_geometry".asInstanceOf[typings.typeorm.typeormStrings.st_geometry]
    
    inline def st_point: typings.typeorm.typeormStrings.st_point = "st_point".asInstanceOf[typings.typeorm.typeormStrings.st_point]
    
    inline def text: typings.typeorm.typeormStrings.text = "text".asInstanceOf[typings.typeorm.typeormStrings.text]
    
    inline def `timestamp with local time zone`: typings.typeorm.typeormStrings.`timestamp with local time zone` = ("timestamp with local time zone").asInstanceOf[typings.typeorm.typeormStrings.`timestamp with local time zone`]
    
    inline def timestamptz: typings.typeorm.typeormStrings.timestamptz = "timestamptz".asInstanceOf[typings.typeorm.typeormStrings.timestamptz]
    
    inline def timetz: typings.typeorm.typeormStrings.timetz = "timetz".asInstanceOf[typings.typeorm.typeormStrings.timetz]
    
    inline def tinyblob: typings.typeorm.typeormStrings.tinyblob = "tinyblob".asInstanceOf[typings.typeorm.typeormStrings.tinyblob]
    
    inline def tinytext: typings.typeorm.typeormStrings.tinytext = "tinytext".asInstanceOf[typings.typeorm.typeormStrings.tinytext]
    
    inline def tsquery: typings.typeorm.typeormStrings.tsquery = "tsquery".asInstanceOf[typings.typeorm.typeormStrings.tsquery]
    
    inline def tsrange: typings.typeorm.typeormStrings.tsrange = "tsrange".asInstanceOf[typings.typeorm.typeormStrings.tsrange]
    
    inline def tstzrange: typings.typeorm.typeormStrings.tstzrange = "tstzrange".asInstanceOf[typings.typeorm.typeormStrings.tstzrange]
    
    inline def tsvector: typings.typeorm.typeormStrings.tsvector = "tsvector".asInstanceOf[typings.typeorm.typeormStrings.tsvector]
    
    inline def uniqueidentifier: typings.typeorm.typeormStrings.uniqueidentifier = "uniqueidentifier".asInstanceOf[typings.typeorm.typeormStrings.uniqueidentifier]
    
    inline def `unsigned big int`: typings.typeorm.typeormStrings.`unsigned big int` = ("unsigned big int").asInstanceOf[typings.typeorm.typeormStrings.`unsigned big int`]
    
    inline def urowid: typings.typeorm.typeormStrings.urowid = "urowid".asInstanceOf[typings.typeorm.typeormStrings.urowid]
    
    inline def uuid: typings.typeorm.typeormStrings.uuid = "uuid".asInstanceOf[typings.typeorm.typeormStrings.uuid]
    
    inline def varbinary: typings.typeorm.typeormStrings.varbinary = "varbinary".asInstanceOf[typings.typeorm.typeormStrings.varbinary]
    
    inline def varbit: typings.typeorm.typeormStrings.varbit = "varbit".asInstanceOf[typings.typeorm.typeormStrings.varbit]
    
    inline def xml: typings.typeorm.typeormStrings.xml = "xml".asInstanceOf[typings.typeorm.typeormStrings.xml]
    
    inline def year: typings.typeorm.typeormStrings.year = "year".asInstanceOf[typings.typeorm.typeormStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.typeormStrings.geometry
    - typings.typeorm.typeormStrings.geography
    - typings.typeorm.typeormStrings.st_geometry
    - typings.typeorm.typeormStrings.st_point
  */
  trait SpatialColumnType
    extends StObject
       with _ColumnType
  object SpatialColumnType {
    
    inline def geography: typings.typeorm.typeormStrings.geography = "geography".asInstanceOf[typings.typeorm.typeormStrings.geography]
    
    inline def geometry: typings.typeorm.typeormStrings.geometry = "geometry".asInstanceOf[typings.typeorm.typeormStrings.geometry]
    
    inline def st_geometry: typings.typeorm.typeormStrings.st_geometry = "st_geometry".asInstanceOf[typings.typeorm.typeormStrings.st_geometry]
    
    inline def st_point: typings.typeorm.typeormStrings.st_point = "st_point".asInstanceOf[typings.typeorm.typeormStrings.st_point]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.typeormStrings.`character varying`
    - typings.typeorm.typeormStrings.`varying character`
    - typings.typeorm.typeormStrings.`char varying`
    - typings.typeorm.typeormStrings.nvarchar
    - typings.typeorm.typeormStrings.`national varchar`
    - typings.typeorm.typeormStrings.character
    - typings.typeorm.typeormStrings.`native character`
    - typings.typeorm.typeormStrings.varchar
    - typings.typeorm.typeormStrings.char
    - typings.typeorm.typeormStrings.nchar
    - typings.typeorm.typeormStrings.`national char`
    - typings.typeorm.typeormStrings.varchar2
    - typings.typeorm.typeormStrings.nvarchar2
    - typings.typeorm.typeormStrings.alphanum
    - typings.typeorm.typeormStrings.shorttext
    - typings.typeorm.typeormStrings.raw
    - typings.typeorm.typeormStrings.binary
    - typings.typeorm.typeormStrings.varbinary
    - typings.typeorm.typeormStrings.string
  */
  trait WithLengthColumnType
    extends StObject
       with _ColumnType
  object WithLengthColumnType {
    
    inline def alphanum: typings.typeorm.typeormStrings.alphanum = "alphanum".asInstanceOf[typings.typeorm.typeormStrings.alphanum]
    
    inline def binary: typings.typeorm.typeormStrings.binary = "binary".asInstanceOf[typings.typeorm.typeormStrings.binary]
    
    inline def char: typings.typeorm.typeormStrings.char = "char".asInstanceOf[typings.typeorm.typeormStrings.char]
    
    inline def `char varying`: typings.typeorm.typeormStrings.`char varying` = ("char varying").asInstanceOf[typings.typeorm.typeormStrings.`char varying`]
    
    inline def character: typings.typeorm.typeormStrings.character = "character".asInstanceOf[typings.typeorm.typeormStrings.character]
    
    inline def `character varying`: typings.typeorm.typeormStrings.`character varying` = ("character varying").asInstanceOf[typings.typeorm.typeormStrings.`character varying`]
    
    inline def `national char`: typings.typeorm.typeormStrings.`national char` = ("national char").asInstanceOf[typings.typeorm.typeormStrings.`national char`]
    
    inline def `national varchar`: typings.typeorm.typeormStrings.`national varchar` = ("national varchar").asInstanceOf[typings.typeorm.typeormStrings.`national varchar`]
    
    inline def `native character`: typings.typeorm.typeormStrings.`native character` = ("native character").asInstanceOf[typings.typeorm.typeormStrings.`native character`]
    
    inline def nchar: typings.typeorm.typeormStrings.nchar = "nchar".asInstanceOf[typings.typeorm.typeormStrings.nchar]
    
    inline def nvarchar: typings.typeorm.typeormStrings.nvarchar = "nvarchar".asInstanceOf[typings.typeorm.typeormStrings.nvarchar]
    
    inline def nvarchar2: typings.typeorm.typeormStrings.nvarchar2 = "nvarchar2".asInstanceOf[typings.typeorm.typeormStrings.nvarchar2]
    
    inline def raw: typings.typeorm.typeormStrings.raw = "raw".asInstanceOf[typings.typeorm.typeormStrings.raw]
    
    inline def shorttext: typings.typeorm.typeormStrings.shorttext = "shorttext".asInstanceOf[typings.typeorm.typeormStrings.shorttext]
    
    inline def string: typings.typeorm.typeormStrings.string = "string".asInstanceOf[typings.typeorm.typeormStrings.string]
    
    inline def varbinary: typings.typeorm.typeormStrings.varbinary = "varbinary".asInstanceOf[typings.typeorm.typeormStrings.varbinary]
    
    inline def varchar: typings.typeorm.typeormStrings.varchar = "varchar".asInstanceOf[typings.typeorm.typeormStrings.varchar]
    
    inline def varchar2: typings.typeorm.typeormStrings.varchar2 = "varchar2".asInstanceOf[typings.typeorm.typeormStrings.varchar2]
    
    inline def `varying character`: typings.typeorm.typeormStrings.`varying character` = ("varying character").asInstanceOf[typings.typeorm.typeormStrings.`varying character`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.typeormStrings.float
    - typings.typeorm.typeormStrings.double
    - typings.typeorm.typeormStrings.dec
    - typings.typeorm.typeormStrings.decimal
    - typings.typeorm.typeormStrings.smalldecimal
    - typings.typeorm.typeormStrings.fixed
    - typings.typeorm.typeormStrings.numeric
    - typings.typeorm.typeormStrings.real
    - typings.typeorm.typeormStrings.`double precision`
    - typings.typeorm.typeormStrings.number
    - typings.typeorm.typeormStrings.datetime
    - typings.typeorm.typeormStrings.datetime2
    - typings.typeorm.typeormStrings.datetimeoffset
    - typings.typeorm.typeormStrings.time
    - typings.typeorm.typeormStrings.`time with time zone`
    - typings.typeorm.typeormStrings.`time without time zone`
    - typings.typeorm.typeormStrings.timestamp
    - typings.typeorm.typeormStrings.`timestamp without time zone`
    - typings.typeorm.typeormStrings.`timestamp with time zone`
    - typings.typeorm.typeormStrings.`timestamp with local time zone`
  */
  trait WithPrecisionColumnType
    extends StObject
       with _ColumnType
  object WithPrecisionColumnType {
    
    inline def datetime: typings.typeorm.typeormStrings.datetime = "datetime".asInstanceOf[typings.typeorm.typeormStrings.datetime]
    
    inline def datetime2: typings.typeorm.typeormStrings.datetime2 = "datetime2".asInstanceOf[typings.typeorm.typeormStrings.datetime2]
    
    inline def datetimeoffset: typings.typeorm.typeormStrings.datetimeoffset = "datetimeoffset".asInstanceOf[typings.typeorm.typeormStrings.datetimeoffset]
    
    inline def dec: typings.typeorm.typeormStrings.dec = "dec".asInstanceOf[typings.typeorm.typeormStrings.dec]
    
    inline def decimal: typings.typeorm.typeormStrings.decimal = "decimal".asInstanceOf[typings.typeorm.typeormStrings.decimal]
    
    inline def double: typings.typeorm.typeormStrings.double = "double".asInstanceOf[typings.typeorm.typeormStrings.double]
    
    inline def `double precision`: typings.typeorm.typeormStrings.`double precision` = ("double precision").asInstanceOf[typings.typeorm.typeormStrings.`double precision`]
    
    inline def fixed: typings.typeorm.typeormStrings.fixed = "fixed".asInstanceOf[typings.typeorm.typeormStrings.fixed]
    
    inline def float: typings.typeorm.typeormStrings.float = "float".asInstanceOf[typings.typeorm.typeormStrings.float]
    
    inline def number: typings.typeorm.typeormStrings.number = "number".asInstanceOf[typings.typeorm.typeormStrings.number]
    
    inline def numeric: typings.typeorm.typeormStrings.numeric = "numeric".asInstanceOf[typings.typeorm.typeormStrings.numeric]
    
    inline def real: typings.typeorm.typeormStrings.real = "real".asInstanceOf[typings.typeorm.typeormStrings.real]
    
    inline def smalldecimal: typings.typeorm.typeormStrings.smalldecimal = "smalldecimal".asInstanceOf[typings.typeorm.typeormStrings.smalldecimal]
    
    inline def time: typings.typeorm.typeormStrings.time = "time".asInstanceOf[typings.typeorm.typeormStrings.time]
    
    inline def `time with time zone`: typings.typeorm.typeormStrings.`time with time zone` = ("time with time zone").asInstanceOf[typings.typeorm.typeormStrings.`time with time zone`]
    
    inline def `time without time zone`: typings.typeorm.typeormStrings.`time without time zone` = ("time without time zone").asInstanceOf[typings.typeorm.typeormStrings.`time without time zone`]
    
    inline def timestamp: typings.typeorm.typeormStrings.timestamp = "timestamp".asInstanceOf[typings.typeorm.typeormStrings.timestamp]
    
    inline def `timestamp with local time zone`: typings.typeorm.typeormStrings.`timestamp with local time zone` = ("timestamp with local time zone").asInstanceOf[typings.typeorm.typeormStrings.`timestamp with local time zone`]
    
    inline def `timestamp with time zone`: typings.typeorm.typeormStrings.`timestamp with time zone` = ("timestamp with time zone").asInstanceOf[typings.typeorm.typeormStrings.`timestamp with time zone`]
    
    inline def `timestamp without time zone`: typings.typeorm.typeormStrings.`timestamp without time zone` = ("timestamp without time zone").asInstanceOf[typings.typeorm.typeormStrings.`timestamp without time zone`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.typeormStrings.tinyint
    - typings.typeorm.typeormStrings.smallint
    - typings.typeorm.typeormStrings.mediumint
    - typings.typeorm.typeormStrings.int
    - typings.typeorm.typeormStrings.bigint
  */
  trait WithWidthColumnType
    extends StObject
       with _ColumnType
  object WithWidthColumnType {
    
    inline def bigint: typings.typeorm.typeormStrings.bigint = "bigint".asInstanceOf[typings.typeorm.typeormStrings.bigint]
    
    inline def int: typings.typeorm.typeormStrings.int = "int".asInstanceOf[typings.typeorm.typeormStrings.int]
    
    inline def mediumint: typings.typeorm.typeormStrings.mediumint = "mediumint".asInstanceOf[typings.typeorm.typeormStrings.mediumint]
    
    inline def smallint: typings.typeorm.typeormStrings.smallint = "smallint".asInstanceOf[typings.typeorm.typeormStrings.smallint]
    
    inline def tinyint: typings.typeorm.typeormStrings.tinyint = "tinyint".asInstanceOf[typings.typeorm.typeormStrings.tinyint]
  }
  
  trait _ColumnType extends StObject
}
