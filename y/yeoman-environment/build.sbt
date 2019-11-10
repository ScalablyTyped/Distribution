organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-2dbb87"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-454b3a",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-ab363a",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-6ef903",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-c396c9",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-d4cc87",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-ca2897")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        