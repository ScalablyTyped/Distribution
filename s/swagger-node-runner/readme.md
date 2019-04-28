
# Scala.js typings for swagger-node-runner

Typings are for version 0.6

## Library description:
Swagger loader and middleware utilities

|                    |                 |
| ------------------ | :-------------: |
| Full name          | swagger-node-runner |
| Keywords           | swagger, api, apis, swagger-connect, swagger-express, swagger-restify, swagger-hapi, swagger-sails |
| # releases         | 0 |
| # dependents       | 7 |
| # downloads        | 701579 |
| # stars            | 1 |

## Links
- [Homepage](https://github.com/theganyo/swagger-node-runner#readme)
- [Bugs](https://github.com/theganyo/swagger-node-runner/issues)
- [Repository](https://github.com/theganyo/swagger-node-runner)
- [Npm](https://www.npmjs.com/package/swagger-node-runner)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for swagger-node-runner 0.6
// Project: https://github.com/theganyo/swagger-node-runner
// Definitions by: Michael Mrowetz <https://github.com/micmro>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.4
/* =================== USAGE ===================

import * as SwaggerNodeRunner from "swagger-node-runner";
import * as express from "express";

let app = express();
let config = {
        appRoot: __dirname
};

SwaggerNodeRunner.create(config, (err, runner) => {
        if (err) {
                throw err; // or handle error
        }
        let middleware = runner.expressMiddleware();
        middleware.register(app);

        const port = process.env.PORT || 10010;
        app.listen(port);

        console.log('try this:\ncurl http://127.0.0.1:' + port + '/v1/hello?name=Scott');
});

 =============================================== */


```

